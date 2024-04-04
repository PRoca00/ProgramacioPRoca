package Escola;

import java.util.ArrayList;

public class Professor extends Persona {
	private ArrayList<String> assignatures = new ArrayList<>();
	
	public Professor(String nom, String adreça) {
		super(nom, adreça);
	}
	
	public boolean afegeixAssignatura(String assignatura) {
		assignatures.add(assignatura);
		
		if (assignatures.contains(assignatura)) {
			return true;
			
		} else {
			return false;
		}
	}
	
	public boolean treuAssignatura(String assignatura) {
		assignatures.remove(assignatura);
		
		if (!assignatures.contains(assignatura)) {
			return true;
			
		} else {
			return false;
		}
	}
}
