package InstitutBàsic;

public class Institut {
	
	private String nom;
	private Alumne[] llistaAlumnes;
	private int nombreAlumnes = 0;
	
	public Institut(String nom) {
		this.nom = nom;
		this.llistaAlumnes = new Alumne[100];
	}
	
	public Institut(String nom, int maxAlumnes) {
		this.nom = nom;
		this.llistaAlumnes = new Alumne[maxAlumnes];
	}
	
	public void afegirAlumne(Alumne al) {
		this.llistaAlumnes[this.nombreAlumnes] = al;
		this.nombreAlumnes++;
	}
	
	public String getInstitutNom() {
		return this.nom;
	}
	
	public int getNombreAlumnes() {
		return this.nombreAlumnes;
	}
	
	public Alumne[] getLlistaAlumnes() {
		return this.llistaAlumnes;
	}
}
