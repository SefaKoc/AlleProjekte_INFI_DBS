
public class Datenformat {

	double datum = 0;
	int tankenr = 0;
	double value = 0;
	public Datenformat(double datum, int tankenr, double value) {
		super();
		this.datum = datum;
		this.tankenr = tankenr;
		this.value = value;
	}
	public double getDatum() {
		return datum;
	}
	public int getTankenr() {
		return tankenr;
	}
	public double getValue() {
		return value;
	}
}
