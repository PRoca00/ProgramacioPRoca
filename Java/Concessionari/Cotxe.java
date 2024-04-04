package Concessionari;

public class Cotxe {
	private String bastidor;
	private String model;
	private String marca;
	
	public Cotxe(String bastidor) {
		this.bastidor = bastidor;
	}
	
	public String toString() {
		String returnString = "Cotxe: " + this.getMarca() + " | Model: " + this.getModel() + " | Bastidor: " + this.getBastidor();
		
		return returnString;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public String getBastidor() {
		return this.bastidor;
	}
}
