package InstitutBàsic;

public class UsaInstitut {

	public static void main(String[] args) {
		Institut Insti1 = new Institut("Institut Hola");
		Institut Insti2 = new Institut("Institut Quetal", 100);
		
		Alumne Alumne1 = new Alumne("Pau", 18, "82736475N", "pau@gmail.com");
		Alumne Alumne2 = new Alumne("Pauet", 17, "82736474N", "pauet@gmail.com");
		Alumne Alumne3 = new Alumne("SrAlumne", 16, "82736445Z", "sralumne@gmail.com");
		Alumne Alumne4 = new Alumne("MrAlumne", 19, "82746475N", "mralumne@gmail.com");
		Alumne Alumne5 = new Alumne("DonAlumne", 20, "82436475R", "donalumne@gmail.com");
		Alumne Alumne6 = new Alumne("Hola", 25, "82731374R", "hola@gmail.com");

		
		Insti1.afegirAlumne(Alumne1);
		Insti1.afegirAlumne(Alumne2);
		Insti1.afegirAlumne(Alumne3);
		
		Insti2.afegirAlumne(Alumne4);
		Insti2.afegirAlumne(Alumne5);
		Insti2.afegirAlumne(Alumne6);
		
		System.out.println("Alumnes del: " + Insti1.getInstitutNom());
		
		for (int i = 0; i < Insti1.getNombreAlumnes(); i++) {
			System.out.println(" - " + Insti1.getLlistaAlumnes()[i].getAlumneNom());
		}
		
		System.out.println();
		
		System.out.println("Alumnes del: " + Insti2.getInstitutNom());
		
		for (int i = 0; i < Insti2.getNombreAlumnes(); i++) {
			System.out.println(" - " + Insti2.getLlistaAlumnes()[i].getAlumneNom());
		}
		
		System.out.println();
	}
}