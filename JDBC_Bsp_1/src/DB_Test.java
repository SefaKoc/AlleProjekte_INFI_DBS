import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class DB_Test {
	Connection c;

public DB_Test() throws ClassNotFoundException, SQLException  {
	Class.forName("com.mysql.jdbc.Driver");
	c = DriverManager.getConnection("jdbc:mysql://localhost/autohaus", "root", "");
}

public ArrayList<Auto>  print() throws SQLException
{
	ArrayList<Auto> car = new ArrayList<Auto>();
	String sql = "SELECT * FROM Auto";
	Statement stmt = c.createStatement();
	ResultSet rs =  stmt.executeQuery(sql);
	while (rs.next())
	{
	int seriennummer = rs.getInt("Seriennummer");
	String marke = rs.getString("Marke");
	String modell = rs.getString("Modell");
	String motorisierung = rs.getString("Motorisierung");
	String farbe = rs.getString("Farbe");

	Auto a = new Auto(seriennummer,marke,modell, motorisierung, farbe);
	car.add(a);
	}
	rs.close();
	stmt.close();
	return car;
	}

public ArrayList<Kunde>  printK() throws SQLException
{
	ArrayList<Kunde> k = new ArrayList<Kunde>();
	String sql = "SELECT * FROM Kunde";
	Statement stmt = c.createStatement();
	ResultSet rs =  stmt.executeQuery(sql);
	while (rs.next())
	{
		String kundennummer = rs.getString("Kundennummer");
		String vorname = rs.getString("Vorname");
		String nachname = rs.getString("Nachname");

		Kunde k1 = new Kunde(kundennummer, vorname, nachname);
		k.add(k1);
	}
	rs.close();
	stmt.close();
	return k;
	}
public ArrayList<Motorrad> printM()throws SQLException{
	ArrayList<Motorrad> mr = new ArrayList<Motorrad>();
	String sql = "SELECT * FROM Motorrad";
	Statement stmt = c.createStatement();
	ResultSet rs =  stmt.executeQuery(sql);
	while (rs.next())
	{
		int seriennummer = rs.getInt("Seriennummer");
		String marke = rs.getString("Marke");
		String modell = rs.getString("Modell");
		String farbe = rs.getString("Farbe");
		String leistung = rs.getString("Leistung");
		String motorhubraum = rs.getString("Motorhubraum");
		int preis = rs.getInt("Preis");
		Motorrad a = new Motorrad(seriennummer,marke,modell,farbe,leistung,motorhubraum,preis);
		mr.add(a);
	}
	rs.close();
	stmt.close();
	return mr;
}

public void addTable(String tabellenname) throws SQLException{
	if(tabellenname=="Auto"){
	String sql = "CREATE TABLE " + tabellenname  + " (  " +
			"   Seriennummer  int PRIMARY KEY, " +
			"Marke varchar(100) NOT NULL," + "Modell varchar(100) NOT NULL,"+
			"Motorisierung  varchar(100) NOT NULL," +
			"Farbe  varchar(20) NOT NULL," + "FOREIGN KEY(kundennummer));";
	System.out.println("Tabelle " + tabellenname + " wurde erstellt!");
	Statement stmt = c.createStatement();
	stmt.executeUpdate(sql);
	stmt.close();
	}
	if(tabellenname=="Motorrad"){
		String sql = "CREATE TABLE " + tabellenname + " (  " + "   Seriennummer  int PRIMARY KEY, " +
				"Marke varchar(100) NOT NULL, " + "Modell varchar(100) NULL," + "Farbe varchar(20) NOT NULL," 
				+ "Leistung varchar(10) NOT NULL," + "Motorhubraum varchar(15) NOT NULL," + 
				"Preis int(200) NULL," + "FOREIGN KEY(kundennummer));";
		System.out.println("Tabelle " + tabellenname + " wurde erstellt!");
		Statement stmt = c.createStatement();
		stmt.executeUpdate(sql);
		stmt.close();
	}	
	if(tabellenname=="Kunde"){
		String sql = "CREATE TABLE " + tabellenname + " (  " + "   Kundennummer  varchar(30) PRIMARY KEY, " +
				"Vorname varchar(30) NOT NULL, " + "Nachname varchar(30) NOT NULL);";
		System.out.println("Tabelle " + tabellenname + " wurde erstellt!");
		Statement stmt = c.createStatement();
		stmt.executeUpdate(sql);
		stmt.close();
	}	
}
public void insertCar(int seriennummer, String marke, String modell, String motorisierung, String farbe) throws SQLException
{	
	String sql = "INSERT INTO Auto VALUES(?,?,?,?,?)";
    PreparedStatement stmt =  c.prepareStatement(sql);
    stmt.setInt(1,seriennummer);
    stmt.setString(2, marke);
    stmt.setString(3, modell);
    stmt.setString(4, motorisierung);
    stmt.setString(5, farbe);
    stmt.executeUpdate();
    stmt.close();
}

public void insertCustomer(String kundennummer, String vorname, String nachname) throws SQLException
{	
	String sql = "INSERT INTO Kunde VALUES(?,?,?)";
    PreparedStatement stmt =  c.prepareStatement(sql);
    stmt.setString(1,kundennummer);
    stmt.setString(2, vorname);
    stmt.setString(3, nachname);
    stmt.executeUpdate();
    stmt.close();
}
public void insertBike(int seriennummer, String marke, String modell, String farbe, String leistung, String motorhubraum, int preis) throws SQLException
{	
	String sql = "INSERT INTO Motorrad VALUES(?,?,?,?,?,?,?)";
    PreparedStatement stmt =  c.prepareStatement(sql);
    stmt.setInt(1,seriennummer);
    stmt.setString(2, marke);
    stmt.setString(3, modell);
    stmt.setString(4, farbe);
    stmt.setString(5, leistung);
    stmt.setString(6, motorhubraum);
    stmt.setInt(7, preis);
    stmt.executeUpdate();
    stmt.close();
}

public void insertCustomerCar(String kundennummer, int seriennummer) throws SQLException
{	
	String sql = "INSERT INTO Kunde VALUES(?,?)";
    PreparedStatement stmt =  c.prepareStatement(sql);
    stmt.setString(1,kundennummer);
    stmt.setInt(2, seriennummer);
    stmt.executeUpdate();
    stmt.close();
}
public void updateCar(int seriennummer, String marke, String modell , String motorisierung, String farbe) throws SQLException{
	String sql = "UPDATE Auto SET marke ='"+marke+"', modell='" +modell+"', motorisierung='" + motorisierung + "', farbe='" + farbe+"' WHERE seriennummer = "+ seriennummer;
	Statement stmt = c.createStatement();
	stmt.executeUpdate(sql);
	stmt.close();
}

public void updateCustomer(String kundennummer, String vorname,String nachname) throws SQLException{
	String sql = "UPDATE Motorrad SET vorname ='"+vorname+"', nachname='" +nachname+ "' WHERE kundennummer = "+ kundennummer;
	Statement stmt = c.createStatement();
	stmt.executeUpdate(sql);
	stmt.close();
}


public void updateBike(int seriennummer, String marke, String modell, String farbe, String leistung, String motorhubraum, int preis) throws SQLException{
	String sql = "UPDATE Motorrad SET marke ='"+marke+"', modell='" +modell+"', farbe='" + farbe + "', leistung='" + leistung + "', motorhubraum='" + motorhubraum + "', preis='" + preis + "' WHERE seriennummer = "+ seriennummer;
	Statement stmt = c.createStatement();
	stmt.executeUpdate(sql);
	stmt.close();
}

public void deleteItem(int seriennummer, String item) throws SQLException{	
	String sql = "DELETE FROM " + item + " WHERE seriennummer = " + seriennummer;
	Statement stmt = c.createStatement();
	stmt.executeUpdate(sql);
	stmt.close();
}

public void deleteCustomer(String tabellenname, String kundennummer, String vorname, String nachname) throws SQLException{
	String sql = "DELETE FROM " + tabellenname + " WHERE kundennummer = " + kundennummer;
	Statement stmt = c.createStatement();
	stmt.executeUpdate(sql);
	stmt.close();
}

public void close() throws SQLException 
{
	c.close();
}

public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
	DB_Test db = new DB_Test();
//	db.addTable("Auto");
//	db.addTable("Motorrad");
//	db.addTable("Kunde");
	db.insertCar(4345342, "Audi", "RS6", "507ps", "blau");
	db.insertCar(76534532, "Bmw", "M5", "507ps", "weiss");
	db.insertBike(254354, "Ducati", "Fire", "schwarz-metallic", "149ps", "1000cc", 10045);
	db.insertCustomer("123457KA4654", "Georg", "Kühler");
	db.insertCustomer("885464KA1245", "Lukas", "Österreicher");
	db.insertCustomerCar("136586aghd", 316541314);
	System.out.println(db.print());
	System.out.println(db.printM());
	System.out.println(db.printK());
	db.deleteItem(613425988, "Auto");
	db.updateCar(645465568, "Bmw", "M4" , "431ps", "rot");
	db.updateBike(254354, "Ducati", "Fire", "weiss", "160ps", "1000cc", 15000);
	db.updateCustomer("885464KA1245", "Lukas", "Mahlknecht");
	db.deleteItem(645417812,"Auto");
	System.out.println();
	System.out.println("Nach dem Löschen : ");
	System.out.print(db.print());
	db.close();
	}	
	}

