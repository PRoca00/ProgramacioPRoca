package banco;

public class FI implements Cuenta {
	private int saldo;
	  private Titular propietario;
	  private double interes = 0.34;
	  private int comisio = 100;
	  
	  public FI(Titular usuario, int saldo) {
	    this.saldo = saldo;
	    this.propietario = usuario;
	  }

	  public FI(Titular usuario) {
	    this.saldo = 0;
	    this.propietario = usuario;
	  }

	  public void ingresarDinero(int dinero) {
	    this.saldo = this.saldo + dinero;
	  }
		public void sacarDinero(int n) throws NoHayDinero {
			if (saldo == -100000) {
				System.out.println("Compte bloquejat, 100.000€ de deute.");
			}
			else if (saldo >= n - 100000) {
				saldo = saldo - n;
				
			} else {
				saldo = -100000;
			}
		}
	
	  public void revisionMensual() {
		  saldo = (int) (saldo + saldo * interes * 0.2 - comisio);
	  }
	
	  public int getSaldo() {
	    return saldo;
	  }
	  

	  public Titular getTitular(){
	  	return propietario;
	  }	
}