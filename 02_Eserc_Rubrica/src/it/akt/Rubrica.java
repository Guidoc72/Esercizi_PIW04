package it.akt;

public class Rubrica {

	  public Contatto [] contatti;
	  public int numeroContatti;
	  
	  public Rubrica (int Contatto) {
		  contatti = new Contatto [4];
		  numeroContatti = 0;
	  }
	
	  public void aggiungiContatto(Contatto contatto) {
		  if (numeroContatti < contatti.length) {
			  contatti [numeroContatti] = contatto;
			  numeroContatti++;
		  }else {
			  System.out.println("Rubrica piena");
		  }
	  }
	
	  public void stampaRubrica() {
		  System.out.println("Rubrica:");
		  for (Contatto c:contatti) {
			  System.out.println(c.toString());
		  }
	  }
	
	
}
