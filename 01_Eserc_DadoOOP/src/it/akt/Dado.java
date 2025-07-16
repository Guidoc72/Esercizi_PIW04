package it.akt;

public class Dado {
	
		//Caratteristiche della classe Dado
		private int numeroFacce;
		
		//Costruttore parametrico controlla che le facce siano maggiori di 4 e minori di 100 e che siano pari altrimenti stampa errore
		public Dado(int numeroFacce)	{
			//setNumeroFacce(numeroFacce) e poi non avrei dovuto scrivere nient'altro al costruttore. Il resto lo avrei dovuto scrivere nel metodo SETTERS
			if (numeroFacce < 4 || numeroFacce > 100 || numeroFacce %2 != 0)	{
		System.out.println("Errore.. il numero di facce deve essere pari e compreso tra 4 e 100");
			} else {
				this.numeroFacce = numeroFacce;
				
			}
		}
		
		public int getNumeroFacce() { 
			return numeroFacce;
			
		}
		
		//private void setNumeroFacce(int numeroFacce) {//lo metto private perche non posso modificare le facce del dado una volta che lo creo oppure non lo creo proprio
			//This.numeroFacce = numeroFacce;
		//}
		
		
		
		
}//end class

