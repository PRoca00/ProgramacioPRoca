package Hotel;

public class WebHotel {

	public static void main(String[] args) {
		Hotel hotelR = new Hotel("HotelR", 3);
		
		Habitació habitació1 = new Habitació(1, Categoria.LUXE, 2);
		Habitació habitació2 = new Habitació(2, Categoria.NORMAL, 1);
		Habitació habitació3 = new Habitació(3, Categoria.LUXE, 3);
		Habitació habitació4 = new Habitació(4, Categoria.NORMAL, 5);
		Habitació habitació5 = new Habitació(5, Categoria.SUPERLUXE, 1);
		
		hotelR.afegirHabitació(habitació1);
		hotelR.afegirHabitació(habitació2);
		hotelR.afegirHabitació(habitació3);
		hotelR.afegirHabitació(habitació4);
		hotelR.afegirHabitació(habitació5);

		Client pau = new Client("Pau", "21705910M", "1357135713571357");
		Client josepet = new Client("Josepet", "123098567J", "019283746584");
		Client pere = new Client("Pere", "1P", "111111111111");
		
		System.out.println();
		System.out.println("Abans de reserves");
		hotelR.mostrarHabitacionsDisponibles();
		
		hotelR.ferReserva(pau, habitació5, 30);
		hotelR.ferReserva(pere, habitació2, 3);
		hotelR.ferReserva(josepet, habitació3, 5);

		
		System.out.println();
		System.out.println("Després de reserves");
		
		hotelR.mostrarHabitacionsDisponibles();
	}

}
