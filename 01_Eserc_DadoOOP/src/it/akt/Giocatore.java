package it.akt;

import java.util.Random;

public class Giocatore {
	
	//metodo 1 passaggio per valore del numero di facce
	public int dadoLanciato(int facce) {
		//rifaccio controlli dato che ricevo un numero 
		if (facce<4 || facce>100 || facce%2!=0) {	
			System.out.println("numero facce non valido");
		}
		Random random= new Random();

		int lancio= random.nextInt(1, facce + 1);	
		return lancio;
	}

	//passaggio per riferimento dell'oggetto dado
	public int dadoLanciato (Dado dado) {
		Random random = new Random();
		int lancio=random.nextInt(1, dado.getFacce() + 1);	
		return lancio;
	}
}
