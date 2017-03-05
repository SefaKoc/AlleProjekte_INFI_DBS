
public class KundeAuto {
	private String kundennummer;
	private int seriennummer;
	public KundeAuto(String kundennummer, int seriennummer) {
		this.kundennummer = kundennummer;
		this.seriennummer = seriennummer;
	}
	public String getKundennummer() {
		return kundennummer;
	}
	public void setKundennummer(String kundennummer) {
		this.kundennummer = kundennummer;
	}
	public int getSeriennummer() {
		return seriennummer;
	}
	public void setSeriennummer(int seriennummer) {
		this.seriennummer = seriennummer;
	}
	
	
}
