package Botiga;

public abstract class Article {
	private String codi;
	private String descripcio;
	private int nombreUnitats;
	private float preuBase;
	
	public Article(String codi, String descripcio, int nombreUnitats, float preuBase) {
		this.codi = codi;
		this.descripcio = descripcio;
		this.nombreUnitats = nombreUnitats;
		this.preuBase = preuBase;
	}
	
	public abstract float CalcularPreuFinal();
	
	public String getCodi() {
		return codi;
	}
	
	public String getDescripcio() {
		return descripcio;
	}
	
	public int getNombreUnitats() {
		return nombreUnitats;
	}
	
	public float getPreuBase() {
		return preuBase;
	}
}
