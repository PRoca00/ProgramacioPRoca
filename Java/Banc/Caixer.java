package Banc;
import java.util.Scanner;

public class Caixer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Banc bbva = new Banc("bbva");
		
		Titular juan = new Titular("44556677K","Juan", "Garcia Martínez");
		Titular pedro = new Titular("44556678L","Pedro", "Lorca Benítez");
		Titular ana = new Titular("44556679J","Ana", "Torres Garriga");

		Compte juanComptePobre = new Compte(juan, "435-0-2367800");
		Compte juanCompteRic = new Compte(juan, "435-0-2367805", 3000);
		Compte pedroCompte = new Compte(pedro, "207-1-0004572", 8200);
		Compte anaCompte = new Compte(ana, "207-1-0004573", 100);
		
		bbva.afegirCompte(juanComptePobre);
		bbva.afegirCompte(juanCompteRic);
		bbva.afegirCompte(pedroCompte);
		bbva.afegirCompte(anaCompte);
		
		System.out.println(bbva.toString());
		
		juanComptePobre.ingressarDiners(2000);
		anaCompte.treureDiners(1000);
		
		System.out.println(bbva.toString());
		
		boolean active = true;
		Compte[] comptesTitular = null;
		
		while(true) {
			while(true) {
				System.out.println("DNI: ");
				String dni = scan.nextLine();
				
				comptesTitular = bbva.login(dni);
				
				if (comptesTitular != null) {
					break;
				}
			}
			
			while(active) {
				System.out.println("1- Afegir saldo\n2- Treure saldo\n3- Veure saldo\n4- Sortir\nSelecció: ");
				int selecció = scan.nextInt();
				
				switch(selecció) {
				case 1:
					System.out.println("Saldo a afegir: ");
					int saldoAfegir = scan.nextInt();
					
					comptesTitular[0].ingressarDiners(saldoAfegir);
					break;
					
				case 2:
					System.out.println("Saldo a treure: ");
					int saldoTreure = scan.nextInt();
					
					comptesTitular[0].treureDiners(saldoTreure);
					break;
				
				case 3:
					System.out.println("Saldo: " + comptesTitular[0].getSaldo());
					break;
				
				case 4: 
					active = false;
					break;
				}
			}
		}
		
	}

}
