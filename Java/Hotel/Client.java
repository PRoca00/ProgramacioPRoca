package Hotel;

public class Client {
	private String nom;
	private String dni;
	private String numTargeta;
	
	public Client(String nom, String dni, String numTargeta) {
		this.nom = nom;
		this.dni = dni;
		this.numTargeta = numTargeta;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getNumTargeta() {
		return numTargeta;
	}
	
	public void setNumTargeta(String numTargeta) {
		this.numTargeta = numTargeta;
	}
}
