package Hotel;

public class Habitació {
	private int num;
	private Categoria categoria;
	private int numLlits;
	private int preuNit;
	private boolean disponible = true;
	
	public Habitació(int num, Categoria categoria, int numLlits) {
		this.num = num;
		this.categoria = categoria;
		this.numLlits = numLlits;
		
		switch(categoria) {
		case SUPERLUXE:
			preuNit = 200;
			break;
		case LUXE:
			preuNit = 100;
			break;
		case NORMAL:
			preuNit = 60;
			break;
		default:
			break;
		}
	}
	
	public String toString() {
		String output = " - Num: " + num + " | Num Llits: " + numLlits + " | Preu Nit: " + preuNit;
		
		return output;
	}
	
	public int getID() {
		return num;
	}
	
	public void setID(int ID) {
		this.num = ID;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}
	
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public int getNumLlits() {
		return numLlits;
	}
	
	public void setNumLlits(int numLlits) {
		this.numLlits = numLlits;
	}
	
	public int getPreuNit() {
		return preuNit;
	}
	
	public boolean isDisponible() {
		return disponible;
	}
	
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
}
