package it.akt;

//esercizio dado
public class Program {

	public static void main(String[] args) {
		Giocatore giocatore = new Giocatore ();
		
		//passaggio per valore
		int facce= 20;
		giocatore.dadoLanciato(facce);
		
		//passaggio per riferimento
		Dado dado = new Dado (20);
		giocatore.dadoLanciato(dado);
		
		System.out.println("lancio 1: " + giocatore.dadoLanciato(dado)); 	//passaggio per riferimento
		System.out.println("lancio 2: " + giocatore.dadoLanciato(facce));	//passaggio per valore
	}
}
