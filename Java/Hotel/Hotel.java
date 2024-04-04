package Hotel;

public class Hotel {
	private String nom;
	private int numEstrelles;
	private Habitació[] habitacions;
	private int numHabitacions = 0;
	private Reserva[] reserves;
	private int numReserves = 0;
	
	public Hotel(String nom, int numEstrelles) {
		this.nom = nom;
		this.numEstrelles = numEstrelles;
		habitacions = new Habitació[10];
		reserves = new Reserva[10];
	}
	
	public void mostrarHabitacionsDisponibles() {
		String output = "Habitacions disponibles: \n";
		
		for (int i = 0; i < numHabitacions; i++) {
			if (habitacions[i].isDisponible()) {
				output += habitacions[i].toString() + "\n";
			}
		}
		
		System.out.println();
		System.out.println(output);
		System.out.println();
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public int getNumEstrelles() {
		return numEstrelles;
	}
	
	public void setNumEstrelles(int numEstrelles) {
		this.numEstrelles = numEstrelles;
	}
	
	public Habitació[] getHabitacions() {
		return habitacions;
	}
	
	public void afegirHabitació(Habitació habitació) {
		habitacions[numHabitacions] = habitació;
		numHabitacions++;
	}
	
	public Reserva[] getReserves() {
		return reserves;
	}
	
	public class HabitacióOcupada extends Exception { 
	    public HabitacióOcupada(String errorMessage) {
	        super(errorMessage);
	    }
	}
	
	public void ferReserva(Client client, Habitació habitació, int numDies) {
		Reserva reserva = new Reserva(numReserves + 1, client, habitació, numDies);
		
		for (int i = 0; i < numHabitacions; i++) {
			if (habitacions[i].isDisponible()) {
				if (habitacions[i].getID() == reserva.getHabitació().getID()) {
					habitacions[i].setDisponible(false);
					
					reserves[numReserves] = reserva;
					numReserves++;
					
					System.out.println();
					System.out.println("L'estància de l'habitació " + habitacions[i].getID() + " costarà: " + reserva.getPreuReserva());
					System.out.println();
				}
			}
			else {
				try {
					throw new HabitacióOcupada("La habitació " + habitacions[i].getID() +" està ocupada!!!");
				}
				catch (HabitacióOcupada err) {
					System.out.println();
					System.out.println(err);
					System.out.println();
				}
			}
		}
	}
}
