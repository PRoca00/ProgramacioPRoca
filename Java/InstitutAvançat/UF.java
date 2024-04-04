package InstitutAvançat;

public class UF {
	private String codi;
	private String nom;
	
	public UF(String codi, String nom) {
		this.codi = codi;
		this.nom = nom;
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
}
