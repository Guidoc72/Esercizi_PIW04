package it.akt;

import java.util.Random;

public class Dado {
		
		//caratteristiche della classe Dado
		public int numeroFacce;
		
		//costruttore parametrico controlla che le facce siano maggiori di 4 e minori di 100 e che siano pari altrimenti stampa errore
		public Dado(int numeroFacce) {
			if (numeroFacce > 4 || numeroFacce < 100 || numeroFacce % 2 != 0) {
				System.err.println("Errore...il numero di facce dev'essere pari e compreso tra 4 e 100.");
			} else {
				this.numeroFacce = numeroFacce;
			}
		}
		
		//inizializzo random
		Random random = new Random();
		
		//metodo per lanciare il dado
		public int lancia() {
			return random.nextInt(numeroFacce + 1);
		}
		
}//end class

