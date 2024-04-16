
package banco;

/**
 * @author NT
 */
public class Banco
{
  private Cuenta[] cuentas;
  private int numCuenta;
  private final int MAX_CUENTAS = 10;

  public Banco() {
    this.cuentas = new Cuenta[MAX_CUENTAS];
    this.numCuenta = 0;
  }  

  public void añadirCuenta(Cuenta nuevaCuenta) {
	if (numCuenta< MAX_CUENTAS){
		cuentas[numCuenta]= nuevaCuenta;
		numCuenta++;
	}   
  }

  public Cuenta buscarCuenta(Titular propietario){
  	for (int i=0;i<=numCuenta;i++){
		if (cuentas[i].getTitular().equals(propietario))
			return cuentas[i];
	}
	return null;
  } 


  public Cuenta buscarCuentaDNI(String dni){
  	for (int i=0;i<=numCuenta;i++){
		if (cuentas[i].getTitular().getDni().equals(dni))
			return cuentas[i];
	}
	return null;
  } 

}
