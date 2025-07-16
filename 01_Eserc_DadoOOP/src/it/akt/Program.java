package it.akt;
//Esercizio Dado
public class Program {

	public static void main(String[] args) {
			Giocatore giocatore = new Giocatore ("Martina");
			
			//passaggio per valore
			int numeroFacce = 40;
			giocatore.lanciaDado(numeroFacce);
			
			//passaggio per riferimento
			Dado dado = new Dado (40);
			giocatore.lanciaDado(dado);
	}
}
