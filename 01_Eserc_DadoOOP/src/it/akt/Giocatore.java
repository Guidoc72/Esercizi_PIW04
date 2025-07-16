package it.akt;

import java.util.Random;

public class Giocatore {
	public String nome; //campo nome = caratteristica della classe giocatore
	
	//costruttore parametrico per richiamare il campo nome
	public Giocatore (String nome) {
		this.nome = nome; 
	}

	//metodo per lanciare il dado --> passaggio per valore (creo una copia dell'originale e le modifiche che faccio sulla copia non si riflettono sull'originale)
	public int lanciaDado (int numeroFacce) {
		if (numeroFacce < 4 || numeroFacce > 100 || numeroFacce % 2 != 0) {
			System.err.println("Numero facce non valido!");
		}
		Random random = new Random(); //il giocatore ha un proprio generatore di numeri casuali per lanciare il dado
		
		int lancio = random.nextInt(1, numeroFacce + 1);
		System.out.println(nome + " ha lanciato un dado a " + numeroFacce + " facce ed è uscito: " + lancio);
		return lancio;
	}
	
	//metodo 2 --> passaggio per riferimento dell'oggetto Dado (creo una copia dell'originale e le modifiche che faccio sulla copia si riflettono sull'originale)
	public int lanciaDado (Dado dado) {
		int lancio = dado.lancia();
		System.out.println(nome + " ha lanciato un dado con " + dado.numeroFacce + " facce ed è uscito: " + lancio);
		return lancio;
	}
	
}//end class
