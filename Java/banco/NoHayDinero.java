package banco;

/**
 * @author NT
 * 
 */
public class NoHayDinero extends Exception {
	private int negativo;

	public int getNegativo() {
		return negativo;
	}

	public void setNegativo(int negativo) {
		this.negativo = negativo;
	}

}
