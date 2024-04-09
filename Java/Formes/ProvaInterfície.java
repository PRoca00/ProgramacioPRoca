package Formes;

import java.util.ArrayList;

public class ProvaInterfície {

	public static void main(String[] args) {
		ArrayList<Figura> figures = new ArrayList<>();
		
		Figura quad= new Quadrat(3.5f);
        Figura circ = new Cercle (3.5f); 
        Figura rect = new Rectangle (2.25f, 2.55f);
        
        figures.add(quad);
        figures.add(circ);
        figures.add(rect);
        
        for (Figura f : figures) {
        	System.out.println(f);
        }
	}

}
