package it.akt;

public class Rubrica {

	private Contatto[] contatti;

	public Rubrica(Contatto[] contatti) {
		this.contatti = contatti;
	}
	
	public void stampaRubrica() {
		for (int i = 0; i < contatti.length; i++) {
			System.out.println(i+1 + ". ");
			contatti [i].stampaContatto();
		}
		
		
		
		
		
		
		
		
	}
	
	
    
    

	

}
