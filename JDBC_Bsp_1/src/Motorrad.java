public class Motorrad {
	private int seriennummer;
	private String marke;
	private String modell;
	private String farbe;
	private String leistung;
	private String motorhubraum;
	private int preis;
	
	public Motorrad(int seriennummer, String marke, String modell,
			String farbe, String leistung, String motorhubraum, int preis) {
		this.seriennummer = seriennummer;
		this.marke = marke;
		this.modell = modell;
		this.farbe = farbe;
		this.leistung = leistung;
		this.motorhubraum = motorhubraum;
		this.preis = preis;
	}
	@Override
	public String toString() {
		return "Motorrad [seriennummer=" + seriennummer + ", marke=" + marke
				+ ", modell=" + modell + ", farbe=" + farbe + ", leistung="
				+ leistung + ", motorhubraum=" + motorhubraum + ", preis="
				+ preis + "]";
	}
	public int getSeriennummer() {
		return seriennummer;
	}
	public void setSeriennummer(int seriennummer) {
		this.seriennummer = seriennummer;
	}
	public String getMarke() {
		return marke;
	}
	public void setMarke(String marke) {
		this.marke = marke;
	}
	public String getModell() {
		return modell;
	}
	public void setModell(String modell) {
		this.modell = modell;
	}
	public String getFarbe() {
		return farbe;
	}
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	public String getLeistung() {
		return leistung;
	}
	public void setLeistung(String leistung) {
		this.leistung = leistung;
	}
	public String getMotorhubraum() {
		return motorhubraum;
	}
	public void setMotorhubraum(String motorhubraum) {
		this.motorhubraum = motorhubraum;
	}
	public int getPreis() {
		return preis;
	}
	public void setPreis(int preis) {
		this.preis = preis;
	}
	
	
	
}
