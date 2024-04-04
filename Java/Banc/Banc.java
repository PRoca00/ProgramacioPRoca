package Banc;

public class Banc {
	private String nom;
	private Compte[] comptes;
	private int nComptes = 0;
	
	public Banc(String nom) {
		this.nom = nom;
		this.comptes = new Compte[10];
	}
	
	public void afegirCompte(Compte compte) {
		this.comptes[this.nComptes] = compte;
		this.nComptes++;
	}
	
	public String toString() {
		String bancDades = "";
		
		bancDades = "Banc: " + this.nom + "\n------------------------------------------------\n";
		
		for (int i = 0; i < this.nComptes; i++) {
			bancDades += this.comptes[i].toString() + "\n";
		}
		
		return bancDades;
	}
	
	public Compte[] login(String dni) {
		Compte[] comptesH = new Compte[3];
		int nComptesH = 0;
		
		for (int i = 0; i < nComptes; i++) {
			if (dni.equals(comptes[i].getTitular().getDni())) {
				comptesH[nComptesH] = comptes[i];
			}
		}
		
		if (comptesH[0] != null) {
			return comptesH;
		} 
		
		System.out.println("No s'ha trobat");
		return null;
	}
}
