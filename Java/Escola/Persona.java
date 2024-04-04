package Escola;

public class Persona {
	private String nom;
	private String adreça;
	
	public Persona(String nom, String adreça) {
		this.nom = nom;
		this.adreça = adreça;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getAdreça() {
		return adreça;
	}
	
	public void setAdreça(String adreça) {
		this.adreça = adreça;
	}
}
