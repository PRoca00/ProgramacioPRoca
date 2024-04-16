package banco;

public class CV implements Cuenta {
	private int saldo;
	  private Titular propietario;
	  private double interes = 0.2;
	  private int comisio = 100;
	  
	  public CV(Titular usuario, int saldo) {
	    this.saldo = saldo;
	    this.propietario = usuario;
	  }

	  public CV(Titular usuario) {
	    this.saldo = 0;
	    this.propietario = usuario;
	  }

	  public void ingresarDinero(int dinero) {
	    this.saldo = this.saldo + dinero;
	  }
		public void sacarDinero(int n) throws NoHayDinero {
			System.out.println("No es poden treure diners");
		}
	
	  public void revisionMensual() {
		  saldo = (int) (saldo + saldo * interes);
	  }
	
	  public int getSaldo() {
	    return saldo;
	  }
	  
	  public Titular getTitular(){
	  	return propietario;
	  }	
}