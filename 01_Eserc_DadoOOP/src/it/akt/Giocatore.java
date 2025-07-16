package it.akt;

import java.util.Random;

public class Giocatore {

		//metodo per lnciare il dado --> passaggio per valore ( creo una copia dell'originale e le modifiche che faccio sulla copia non si riflettono sull'originale)
		public int lanciaDado (int numeroFacce)	{
			if (numeroFacce < 4 || numeroFacce > 100 || numeroFacce %2 != 0) {//rifaccio controllo del numero delle facce
				System.out.println("Errore.. il numero di facce deve essere pari o compreso tra 4 e 100");
		
			}
		Random random = new Random(); //il giocatore ha un proprio generatore di numeri casuali per lanciare il dado
		int lancio = random.nextInt(1,numeroFacce + 1);	//il numero lanciato deve andare da 1 a 100, scrivo numeroFacce + 1 perche il metodo Random esclude il numero Finale
		return lancio;
		}
		
		//metodo 2 --> passaggio per riferimento dell'oggetto Dado (creo una copia dell'originale e le modifiche che faccio sulla copia si riflettono sull'originale). creo un legame
		public int lanciaDado(Dado dado) { //Non serve rifare il controllo delle facce con il passaggio di riferimento
			Random random = new Random();
		int lancio = random.nextInt(1, dado.getNumeroFacce() + 1);
		return lancio;
		}
}
