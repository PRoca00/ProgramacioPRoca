package Banc;

public class Compte {
	private String numCompte;
	private Titular titular;
	private int saldo;
	
	public Compte(Titular titular, String numCompte, int... saldo) {
		this.titular = titular;
		this.numCompte = numCompte;	
		this.saldo = saldo.length > 0 ? saldo[0] : 0;
	}
	
	public String toString() {
		String str = "Nom: " + this.titular.getNom() + " | Cognoms: " + this.titular.getCognoms() +" | DNI: " + this.titular.getDni() + " | Número Compte: " + this.numCompte + " | Saldo: " + this.saldo;
		
		return str;
	}
	
	public void ingressarDiners(int diners) {
		this.saldo += diners;
	}
	
	public class SaldoNegatiu extends Exception { 
	    public SaldoNegatiu(String errorMessage) {
	        super(errorMessage);
	    }
	}
	
	public void treureDiners(int diners) {
		try {
			this.saldo -= diners;
				
			if (this.saldo < 0) { 
				throw new SaldoNegatiu("Saldo per sota de 0"); 
				}
			
		} catch (SaldoNegatiu err) {
			this.saldo = 0;
		}
	}
	
	public String getNumCompte() {
		return this.numCompte;
	}
	
	public int getSaldo() {
		return this.saldo;
	}
	
	public Titular getTitular() {
		return this.titular;
	}
}
