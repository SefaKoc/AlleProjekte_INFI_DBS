
public class Auto {
    private int seriennummer;
	private String marke;
	private String modell;
	private String motorisierung;
	private String farbe;

	
	public Auto(int seriennummer, String marke, String modell, String motorisierung, String farbe) {
		this.seriennummer = seriennummer;
		this.marke = marke;
		this.modell = modell;
		this.motorisierung = motorisierung;
		this.farbe = farbe;
	}
	@Override
	public String toString() {
		return "Auto [seriennummer=" + seriennummer + ", marke=" + marke
				+ ", modell=" + modell + ", motorisierung=" + motorisierung
				+ ", farbe=" + farbe + "]";
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

	public String getMotorisierung() {
		return motorisierung;
	}

	public void setMotorisierung(String motorisierung) {
		this.motorisierung = motorisierung;
	}
	
}
