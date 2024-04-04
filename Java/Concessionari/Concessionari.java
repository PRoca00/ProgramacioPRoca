package Concessionari;

public class Concessionari {

	private Cotxe[] cotxes;
	private int nombreCotxes;
	
	public Concessionari() {
		this.cotxes = new Cotxe[5];
		this.nombreCotxes = 0;
	}
	
	public String toString() {
		String returnString = "Cotxes en concessionari:\n";
		
		for (Cotxe cotxe : this.cotxes) {
			if (cotxe != null) {
				String carString = cotxe.toString();
			
				returnString = returnString + carString + "\n";
			}
		}
		
		return returnString;
	}
	
	public void nouCotxe(Cotxe cotxe) {
		this.cotxes[this.nombreCotxes] = cotxe;
		nombreCotxes++;
	}

	public Cotxe buscaCotxe(String bastidor) {
		for (Cotxe cotxe : this.cotxes) {
			if (cotxe.getBastidor() == bastidor) {
				return cotxe;
			}
		}
		return null;
	}
}
