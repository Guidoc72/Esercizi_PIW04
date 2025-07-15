package it.akt;

import java.util.Random;

public class Dado {
		public int facce;
		
		public Dado(int facce) {
			//faccio controllo prima di inizializzarlo
			if (facce<4 || facce>100 || facce%2!=0) {	
				System.out.println("il dado deve avere un numero di facce pari compreso tra 4 e 100");
			}else {
				this.facce=facce;		//se è compreso lo inizializzo
			}
		}
		Random random = new Random();
		
		public int lancia() {
			return random.nextInt(1,facce + 1);
		}
	
		
}