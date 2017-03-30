import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SqlReader {
	public Connection c = null;
	public  Datenformat readDatabase(int tankennr) throws SQLException, 
	ClassNotFoundException{
				//SqlReader.connect();
				connect();
		 		Statement s = c.createStatement();
		 		ArrayList<Datenformat> dataT = new ArrayList<Datenformat>();
		 		int a=0;
		        ResultSet rs = s.executeQuery("Select * from sprit_data WHERE tankennr=" + tankennr + ";");
		        while (rs.next()) {
		        	a++;
		        	Datenformat e = new Datenformat(rs.getInt("datum"),
		        	rs.getInt("tankennr"),
		        	rs.getDouble("value"));
		            dataT.add(e);
		        }
		        rs.close();   
		        return dataT;
	}
	
	public void connect() throws SQLException, ClassNotFoundException{
		if(!c){
			Class.forName("org.sqlite.JDBC");
			 c = DriverManager.getConnection("jdbc:sqlite:sprit.db");
			 System.out.println("Connection successfully");
			 c = true;
		} else{
			c = false;
			System.out.println("Connection false");
		}       
	}
	public  ArrayList<Integer> holeTankstellen() throws SQLException, ClassNotFoundException{
		connect();
 		Statement stat = c.createStatement();
 		ArrayList<Integer> s = new ArrayList<Integer>();
        ResultSet rs = stat.executeQuery("Select tankennr from sprit_data;");
        while (rs.next()) {	
        	if(!s.contains(rs.getInt("tankennr"))){
        	s.add(rs.getInt("tankennr"));
        	}
        }
        rs.close();
        System.out.println(s);      
        return s;
	}
}