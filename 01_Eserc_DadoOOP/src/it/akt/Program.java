package it.akt;
//Esercizio Dado
public class Program {

	public static void main(String[] args) {
		Giocatore giocatore = new Giocatore();
		
		Dado d6 = new Dado(6);
		//Dado d3 = new Dado(3); avrebbe dato errore perché non è un numero pari
			
		//passaggio per valore
		System.out.println("lancio 1: " + giocatore.lanciaDado(6));
		//oppure
		System.out.println("lancio 2: " + giocatore.lanciaDado(d6.getNumeroFacce()));
			
		//passaggio per riferimento
		System.out.println("lancio 3: " + giocatore.lanciaDado(d6));
	}
}
