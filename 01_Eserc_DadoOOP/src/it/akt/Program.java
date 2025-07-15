package it.akt;

//esercizio dado
public class Program {

	public static void main(String[] args) {
		Giocatore giocatore = new Giocatore ("Giulia");
		
		//passaggio per valore
		int facce= 20;
		giocatore.dadoLanciato(facce);
		
		//passaggio per iferimento
		Dado dado = new Dado (20);
		giocatore.dadoLanciato(dado);
		
	}
}
