
package banco;

public interface Cuenta {
	
	abstract public void ingresarDinero(int dinero);
	abstract public void sacarDinero(int n) throws NoHayDinero;
	abstract public void revisionMensual();
	public Titular getTitular();
	public int getSaldo();

}