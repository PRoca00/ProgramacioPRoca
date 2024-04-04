package Botiga;

public class CPU extends Article {
	private int velocitat;
	
	public CPU(String codi, String descripcio, int nombreUnitats, float preuBase, int velocitat) {
		super(codi, descripcio, nombreUnitats, preuBase);
		this.velocitat = velocitat;
	}
	
	public float CalcularPreuFinal() {
		return (getPreuBase() * velocitat);
	}
	
	public int getVelocitat() {
		return velocitat;
	}
	
	public String toString() {
		String str = getCodi() + "  " + getDescripcio() + " " + getNombreUnitats() + "   " + getVelocitat() + "MHz   " + CalcularPreuFinal();
		
		return str;
	}
}
