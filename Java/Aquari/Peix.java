package Aquari;

public class Peix extends Organisme {
	protected String procedencia;
	protected char dieta;
	protected double longitud;
	
	public Peix(String nom, String familia, char llum, double tempMax, double tempMin, double phMax, double phMin, String procedencia, char dieta, double longitud) {
		super(nom, familia, llum, tempMax, tempMin, phMax, phMin);
		this.procedencia = procedencia;
		this.dieta = dieta;
		this.longitud = longitud;
	}
	
	public String tipusDieta() {
		switch (dieta) {
			case 'A':
				return ("Aquest animal s'alimente d'algues");
			case 'O':
				return ("Aquest animal és omnívor, menja de tot");
			case 'F':
				return ("Aquest animal s'alimente de fulles");
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
		output += "\nProcedencia: " + procedencia;
		output += "\nDieta: " + tipusDieta();
		output += "\nLongitud: " + longitud;
		
		return output;
	}
}
