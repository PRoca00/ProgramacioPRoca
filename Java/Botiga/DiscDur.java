package Botiga;

public class DiscDur extends Article {
	private int capacitat;
	
	public DiscDur(String codi, String descripcio, int nombreUnitats, float preuBase, int capacitat) {
		super(codi, descripcio, nombreUnitats, preuBase);
		this.capacitat = capacitat;
	}
	
	public float CalcularPreuFinal() {
		return (getPreuBase() * capacitat * 0.9f);
	}
	
	public int getCapacitat() {
		return capacitat;
	}
	
	public String toString() {
		String str = getCodi() + "   " + getDescripcio() + "   " + getNombreUnitats() + "   " + getCapacitat() + "GB     " + CalcularPreuFinal();
		
		return str;
	}
}
