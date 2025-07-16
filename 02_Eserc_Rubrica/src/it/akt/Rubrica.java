package it.akt;

public class Rubrica {
	
	//creo l'array
	private Contatto [] contatti;
	
	//costruttore
	public Rubrica(Contatto[] contatti) {
		this.contatti = contatti;
	}
	
	//metodo per stampare la rubrica. All'interno inserisco un ciclo for per salvare ogni contatto all'interno della rubrica
	public void stampaRubrica() {
		System.out.println("Contenuto della rubrica:");
		for (int i = 0; i < contatti.length; i++) {
			System.out.println((i + 1) + ". "); //così stamperà una lista di contatti a partire da 1.
			contatti[i].stampaContatto(); //richiamo il metodo per la stampa dei contatti nella classe Contatto
		}
	}
	

}
