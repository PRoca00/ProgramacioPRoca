package InstitutAvançat;

import java.util.ArrayList;

public class Mòdul {
	private String codi;
	private String nom;
	private ArrayList<UF> UFs = new ArrayList<>();
	
	public Mòdul(String codi, String nom) {
		this.codi = codi;
		this.nom = nom;
	}
	
	public void afegirUF(String codi, String nom) {
		UF uf = new UF(codi, nom);
		
		UFs.add(uf);
	}
	
	public String toString() {
		String output = codi + ": " + nom;;
		
		return output;
	}
	
	public String getCodi() {
		return codi;
	}
	
	public void setCodi(String codi) {
		this.codi = codi;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public ArrayList<UF> getUFs() {
		return UFs;
	}
}
