package Aquari;

public abstract class Organisme {
	protected String nom;
	protected String familia;
	protected char llum;
	protected double tempMax;
	protected double tempMin;
	protected double phMax;	
	protected double phMin;
	
	public Organisme(String nom, String familia, char llum, double tempMax, double tempMin, double phMax, double phMin) {
		this.nom = nom;
		this.familia = familia;
		this.llum = llum;
		this.tempMax = tempMax;
		this.tempMin = tempMin;
		this.phMax = phMax;
		this.phMin= phMin;
	}
	
	public abstract String dadesMostrar();
	
	public String acidesa() {
		return ("Acidesa entre: " + phMin + "ph y " + phMax + "ph");
	}
	
	public String temperatura() {
		return ("Temperatura entre: " + tempMin + "Cº y " + tempMax + "Cº");
	}
	
	public String tipusLlum() {
		switch (llum) {
			case 'A':
				return ("Llum alta");
				
			case 'M':
				return ("Llum mitjana");
				
			case 'B':
				return ("Llum baixa");
			
			default:
				return null;
		}
	}
}
