
public class Konyv {
	private String cim;
	private String szerzo;
	private int ev;
	private double ar;
	
	public void incPrice(double szazalek) {
		ar *= (szazalek+100)/100;
	}
	
	public Konyv(String cim, String szerzo, int ev, double ar) {
		super();
		this.cim = cim;
		this.szerzo = szerzo;
		this.ev = ev;
		this.ar = ar;
	}
	
	public Konyv(String cim, String szerzo) {
		super();
		this.cim = cim;
		this.szerzo = szerzo;
		this.ar = 2500;
		this.ev = 2021;
	}
	
	@Override	
	public String toString() {
		return "Konyv [cim=" + cim + ", szerzo=" + szerzo + ", ev=" + ev + ", ar=" + ar + "]";
	}

	public String getCim() {
		return cim;
	}

	public void setCim(String cim) {
		this.cim = cim;
	}

	public String getSzerzo() {
		return szerzo;
	}

	public void setSzerzo(String szerzo) {
		this.szerzo = szerzo;
	}

	public int getEv() {
		return ev;
	}

	public void setEv(int ev) {
		this.ev = ev;
	}

	public double getAr() {
		return ar;
	}

	public void setAr(int ar) {
		this.ar = ar;
	}
	
	
}
