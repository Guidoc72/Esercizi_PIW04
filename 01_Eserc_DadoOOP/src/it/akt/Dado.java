package it.akt;

public class Dado {
		private int facce;
		
		public Dado(int facce) {							//costruttore
			//faccio controllo prima di inizializzarlo
			if (facce<4 || facce>100 || facce%2!=0) {	
				System.out.println("il dado deve avere un numero di facce pari compreso tra 4 e 100");
			}else {
				this.facce=facce;		//se è compreso lo inizializzo
			}
		}

		public int getFacce() {							//rendo l'accesso pubblico in sola lettura
			return facce;
		}

		//private void setFacce(int facce) {			//o lo metto privato così da non poter essere modificato oppure non lo metto proprio
			//this.facce = facce;
		//}
	
}