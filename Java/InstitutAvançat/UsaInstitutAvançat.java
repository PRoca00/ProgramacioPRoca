package InstitutAvançat;

public class UsaInstitutAvançat {
	
	public static void main(String[] args) {
		Cicle DAM = new Cicle("DAM", "Desenvolupament d'Aplicacions Multiplataforma");
		Cicle ASIX = new Cicle("ASIX",  "Administració de Sistemes Informàtics en Xarxa");
		
		Mòdul M1 = new Mòdul("M1", "Sistemes Informàtics");
		Mòdul M2 = new Mòdul("M2", "Base de Dades");
		Mòdul M3 = new Mòdul("M3", "Programació");
		Mòdul M6 = new Mòdul("M6", "Accés a Dades");
		Mòdul M7 = new Mòdul("M7", "Planifiació i Administració de Xarxes");
		
		
		M1.afegirUF("UF1", "Instal·lació, configuració i explotació del sistema informàtic");
		M1.afegirUF("UF2", "Gestió de la informació i de recursos en una xarxa");
		
		M2.afegirUF("UF1", "Introducció a les BBDD");
		M2.afegirUF("UF2", "Llenguatges SQL: DML i DDL");
		
		M3.afegirUF("UF1", "Programació estructurada");
		M3.afegirUF("UF2", "Disseny modular");
		
		M6.afegirUF("UF1", "Persistència en fitxers");
		M6.afegirUF("UF2", "Persistència en BDR-BDOR-BDOO");
		
		M7.afegirUF("UF1", "Introducció a les xarxes");
		M7.afegirUF("UF2", "Administració de dispositius de xarxa");
		
		
		DAM.afegirMòdul(M1, M2, M3, M6);
		ASIX.afegirMòdul(M1, M2, M3, M7);
		
		
		System.out.println();
		
		System.out.println(DAM);
		
		System.out.println();
		
		System.out.println(ASIX);
		
		System.out.println();
		
	
		
	}
}
