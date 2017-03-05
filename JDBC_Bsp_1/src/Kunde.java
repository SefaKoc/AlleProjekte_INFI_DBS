
public class Kunde {
	private String vorname;
	private String nachname;
	private String kundennummer;
	public Kunde(String kundennummer,String vorname, String nachname) {
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
	public String getKundennummer() {
		return kundennummer;
	}
	public void setKundennummer(String kundennummer) {
		this.kundennummer = kundennummer;
	}
}
