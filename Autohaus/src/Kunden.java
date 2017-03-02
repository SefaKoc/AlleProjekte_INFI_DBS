
public class Kunden {
	private String vorname;
	private String nachname;
	private int kundennummer;
	public Kunden(String vorname, String nachname, int kundennummer) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
		this.kundennummer = kundennummer;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public int getKundennummer() {
		return kundennummer;
	}
	public void setKundennummer(int kundennummer) {
		this.kundennummer = kundennummer;
	}
}
