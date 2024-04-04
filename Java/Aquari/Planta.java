package Aquari;

public class Planta extends Organisme {
	protected char tipus;
	
	public Planta(String nom, String familia, char llum, double tempMax, double tempMin, double phMax, double phMin, char tipus) {
		super(nom, familia, llum, tempMax, tempMin, phMax, phMin);
		this.tipus = tipus;
	}
	
	public String tipusPlanta() {
		switch (tipus) {
		case 'T':
			return ("Tipus tija");
		case 'B':
			return ("Tipus bulb");
		case 'A':
			return ("Tipus arrels");
		default:
			return null;
	}
	}

	public String dadesMostrar() {
		String output = "   Dades de " + nom;
		output += "\nFamilia: " + familia;
		output += "\nIntensitat llum: " + tipusLlum();
		output += "\nAcidesa: " + acidesa();
		output += "\nTemperatura: " + temperatura();
		output += "\nTipus: " + tipusPlanta();
		
		return output;
	}
}
