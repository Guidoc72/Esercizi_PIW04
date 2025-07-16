package it.akt;

import java.util.Random;

public class Giocatore {
	
	//metodo per lanciare il dado --> passaggio per valore (creo una copia dell'originale e le modifiche che faccio sulla copia non si riflettono sull'originale)
	public int lanciaDado (int numeroFacce) {
		if (numeroFacce < 4 || numeroFacce > 100 || numeroFacce % 2 != 0) { //rifaccio il controllo del numero delle facce
			System.err.println("Errore...il numero di facce dev'essere pari e compreso tra 4 e 100.");
		}
		Random random = new Random(); //il giocatore ha un proprio generatore di numeri casuali per lanciare il dado
		int lancio = random.nextInt(1, numeroFacce + 1); //il numero lanciato deve andare da 1 a 100, scrivo numeroFacce + 1 perché il metodo Random esclude il numero finale, quindi non scrivendo +1 arriverebbe a 99 e non a 100
		return lancio;
	}
	
	//metodo 2 --> passaggio per riferimento dell'oggetto Dado (creo una copia dell'originale e le modifiche che faccio sulla copia si riflettono sull'originale). crea un legame tra la classe Dado e la classe Giocatore
	public int lanciaDado(Dado dado) { //non serve rifare il controllo delle facce con il passaggio per riferimento
		Random random = new Random();
		int lancio = random.nextInt(1, dado.getNumeroFacce() + 1);		
		return lancio;
	}
	
}//end class
