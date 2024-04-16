package banco;

public class CP implements Cuenta {
	private int saldo;
	  private Titular propietario;
	  private double interes = 0.6;
	  private int comisio = 100;
	  private int puntos = 0;
	  
	  public CP(Titular usuario, int saldo) {
	    this.saldo  = saldo;
	    this.propietario = usuario;
	  }

	  public CP(Titular usuario) {
	    this.saldo  = 0;
	    this.propietario = usuario;
	  }

	  public void ingresarDinero(int dinero) {
	    this.saldo = this.saldo + dinero;
	    
	    int counter = 0;
	    
	    for (int i = 0; i < saldo; i++) {
	    	if (counter < 6) {
	    		counter += 1;
	    		
	    	} else {
	    		puntos += 1;
	    		counter = 0;
	    	}
	    }
	    
	    System.out.println("Puntos: " + puntos);
	  }
		public void sacarDinero(int n) throws NoHayDinero {
			if (saldo >= n) {
				saldo = saldo - n;
			} else {
				NoHayDinero nhd = new NoHayDinero();
				nhd.setNegativo(n - saldo);
				throw nhd;
			}
		}
	
	  public void revisionMensual() {
		  saldo = (int) (saldo + saldo * interes - comisio);
	  }
	
	  public int getSaldo() {
	    return saldo;
	  }
	  
	  public Titular getTitular(){
	  	return propietario;
	  }	
}