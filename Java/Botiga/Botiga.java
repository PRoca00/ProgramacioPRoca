package Botiga;

import java.util.ArrayList;

public class Botiga {
	private ArrayList<Article> articles = new ArrayList<>();
	
	public void afegirArticle(Article article) {
		articles.add(article);
	}
	
	public void eliminarArticle(Article article) {
		for (int i = 0; i < articles.size(); i++) {
			if (articles.get(i) == article) {
				articles.remove(i);
			}
		}
	}
	
	public double calcularPreuTotal() {
		int preuTotal = 0;
		
		for (Article a : articles) {
			preuTotal += a.CalcularPreuFinal();
		}
		
		return preuTotal;
	}
	
	public void llistarEstoc() {
		String output = "Codi   Descrició   Uni.   Cap./Vel.   Preu   \n";
		int nDiscs = 0;
		int nCPUs = 0;
		float dinersTotals = 0;
		
		for (Article a : articles) {
			output += a.toString() + "\n";	
			dinersTotals += a.CalcularPreuFinal();
			
			if (a instanceof DiscDur) {
				nDiscs += 1;
				
			} else {
				nCPUs += 1;
			}
		}
		
		
		output += "\nNombre discs en estoc: " + nDiscs + "\nNombre CPUs en estoc: " + nCPUs + "\n";
		output += "\nValor total de l'estoc: " + dinersTotals;
		
		System.out.println(output);
	}
	
	public static void main(String args[]) {
		Botiga botiga = new Botiga();

		botiga.afegirArticle(new DiscDur("dd1","Disc Dur 1",40,1.5f,100));
		botiga.afegirArticle(new CPU("cpu1","Processador 1",35,0.05f,2500));
		botiga.afegirArticle(new DiscDur("dd2","Disc Dur 2",22,1f,150));
		botiga.afegirArticle(new DiscDur("dd3","Disc Dur 3",11,2f,100));
		botiga.afegirArticle(new CPU("cpu2","Processador 2",10,0.07f,2800));

		botiga.llistarEstoc();
	}
}
