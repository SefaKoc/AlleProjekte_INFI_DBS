
public class Werkstatt {
	private String werkstatt_id;
	private String bezeichung;
	private String reparaturabteilung;
	
	public Werkstatt(String werkstatt_id, String bezeichung,
			String reparaturabteilung) {
		super();
		this.werkstatt_id = werkstatt_id;
		this.bezeichung = bezeichung;
		this.reparaturabteilung = reparaturabteilung;
	}
	public String getWerkstatt_id() {
		return werkstatt_id;
	}
	public void setWerkstatt_id(String werkstatt_id) {
		this.werkstatt_id = werkstatt_id;
	}
	public String getBezeichung() {
		return bezeichung;
	}
	public void setBezeichung(String bezeichung) {
		this.bezeichung = bezeichung;
	}
	public String getReparaturabteilung() {
		return reparaturabteilung;
	}
	public void setReparaturabteilung(String reparaturabteilung) {
		this.reparaturabteilung = reparaturabteilung;
	}
	
	
}
