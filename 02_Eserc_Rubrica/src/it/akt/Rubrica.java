package it.akt;

public class Rubrica {

	  private Contatto [] contatti;
	  private int numeroContatti;
	  
	  public Rubrica (int Contatto) {
		  contatti = new Contatto [10];		//inizializzo array
		  numeroContatti = 0;				//inizializzo indice array
	  }
	
	  public void aggiungiContatto(Contatto contatto) {
		  if (numeroContatti < contatti.length) {
			  contatti [numeroContatti] = contatto;
			  numeroContatti++;
		  }else {
			  System.out.println("Errore! non puoi aggiungere ulteriori contatti, la rubrica è piena");
		  }
	  }
	
	  public void stampaRubrica() {
		  System.out.println("Rubrica:");
		  for (Contatto c:contatti) {				//sintassi: tipo+nome:array
			  System.out.println(c.toString());		//per stampare a stringa
		  }
	  }
	
	
}
