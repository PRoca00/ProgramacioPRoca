package banco;

public class CC implements Cuenta
{
  private int saldo;
  private Titular propietario;
  private double interes = 0.1;
  private int comisio = 100;
  
  public CC(Titular usuario, int saldo) {
    this.saldo  = saldo;
    this.propietario = usuario;
  }

  public CC(Titular usuario) {
    this.saldo  = 0;
    this.propietario = usuario;
  }

  public void ingresarDinero(int dinero) {
    this.saldo = this.saldo + dinero;
  }

  public void sacarDinero(int n) throws NoHayDinero {
		if (saldo >= n) {
			saldo = saldo - n;
			
		} else {
			saldo = 0;
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
