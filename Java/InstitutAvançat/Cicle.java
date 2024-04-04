package InstitutAvançat;

import java.util.ArrayList;

public class Cicle {
	private String codi;
	private String nom;
	private ArrayList<Mòdul> mòduls = new ArrayList<>();
	
	public Cicle(String codi, String nom) {
		this.codi = codi;
		this.nom = nom;
	}
	
	public void afegirMòdul(Mòdul... mòduls) {
		for (Mòdul m : mòduls) {
			this.mòduls.add(m);
		}
	}
	
	public String toString() {
		String output = codi + ": " + nom + "\n------------------------------------------------------------------------\n";
		
		for (Mòdul m : mòduls) {
			output += m.toString() + "\n";
			
			for (UF uf : m.getUFs()) {
				output += "  " + uf.toString() + "\n";
			}
			
			output += "\n";
		}
		
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
}
