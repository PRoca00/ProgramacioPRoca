package Hotel;

public class Reserva {
	private int id;
	private Client client;
	private Habitació habitació;
	private int numDies;	
	private int preuReserva;
	
	public Reserva(int id, Client client, Habitació habitació, int numDies) {
		this.id = id;
		this.client = client;
		this.habitació = habitació;
		this.numDies = numDies;
		
		preuReserva = numDies * habitació.getPreuNit();
	}
	
	public String toString() {
		String output = "El client: " + client.getNom() + ", pagarà " + preuReserva + "€, per una estància de " + numDies + " dies";
		
		return output;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Client getClient() {
		return client;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}
	
	public Habitació getHabitació() {
		return habitació;
	}
	
	public void setHabitació(Habitació habitació) {
		this.habitació = habitació;
	}
	
	public int getNumDies() {
		return numDies;
	}
	
	public void setNumDies(int numDies) {
		this.numDies = numDies;
	}
	
	public int getPreuReserva() {
		return preuReserva;
	}
}
