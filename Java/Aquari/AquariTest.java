package Aquari;

import java.util.ArrayList;

public class AquariTest {
	public static ArrayList<Organisme> organismes = new ArrayList<>();
	
	public static void dadesOrganisme(Organisme o) {
		System.out.println(o.dadesMostrar());
	}
	
	public static void main(String args[]) {
		Peix peix1 = new Peix("peix","peixos",'A',12,14,6,7,"Mediterrani",'A',34);

		Peix peix2 = new Peix("peix","peixos",'B',11,13,4,6,"Mediterrani",'O',34);

		Peix peix3 = new Peix("peix","peixos",'M',2,10,3,5,"Mediterrani",'F',34);

		Planta planta1 = new Planta("planta","plantes",'B',18,19,6,9,'T');

		Planta planta2 = new Planta("planta","plantes",'M',15,17,7,8,'B');

		Planta planta3 = new Planta("planta","plantes",'A',20,23,3,5,'A');
		
		organismes.add(peix1);
		organismes.add(peix2);
		organismes.add(peix3);
		organismes.add(planta1);
		organismes.add(planta2);
		organismes.add(planta3);
		
		for (Organisme o : organismes) {
			dadesOrganisme(o);
			
			System.out.println("********************");
		}
	}
}
