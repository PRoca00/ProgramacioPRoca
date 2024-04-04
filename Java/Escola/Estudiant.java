package Escola;

public class Estudiant extends Persona {
	private String cicle;
	private int curs;
	
	public Estudiant(String nom, String adreça, String cicle, int curs) {
		super(nom, adreça);
		this.cicle = cicle;
		this.curs = curs;
	}
	
	public String getCicle() {
		return cicle;
	}
	
	public void setCicle(String cicle) {
		this.cicle = cicle;
	}
	
	public int getCurs() {
		return curs;
	}
	
	public void setCurs(int curs) {
		this.curs = curs;
	}
}
