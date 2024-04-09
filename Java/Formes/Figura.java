package Formes;

public interface Figura {  

    abstract public float area();   

    abstract public float perimetre();

}

class Quadrat implements Figura {
	
	private float costat;
	
	public Quadrat(float costat) {
		this.costat = costat;
	}
	
	public String toString() {
		return "Perimetre: " + perimetre() + "\nArea: " + area();
	}

	@Override
	public float area() {
		return costat * costat;
	}

	@Override
	public float perimetre() {
		return costat * 4;
	}
}

class Rectangle implements Figura {
	
	private float costat1;
	private float costat2;
	
	public Rectangle(float costat1, float costat2) {
		this.costat1 = costat1;
		this.costat2 = costat2;
	}
	
	public String toString() {
		return "Perimetre: " + perimetre() + "\nArea: " + area();
	}

	@Override
	public float area() {
		return costat1 * costat2;
	}

	@Override
	public float perimetre() {
		return costat1 * 2 + costat2 * 2;
	}
}

class Cercle implements Figura {

	private float radi;
	
	public Cercle(float radi) {
		this.radi = radi;
	}
	
	public String toString() {
		return "Perimetre: " + perimetre() + "\nArea: " + area();
	}
	
	@Override
	public float area() {
		return (float) Math.PI * radi * radi;
	}

	@Override
	public float perimetre() {
		return (float) Math.PI * radi * 2;
	}
}