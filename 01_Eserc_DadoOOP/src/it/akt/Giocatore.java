package it.akt;

import java.util.Random;
import java.util.Scanner;

public class Giocatore {
	public String nome;
	
	public Giocatore (String nome) {
		this.nome= nome;
	}
	
	//metodo 1 passaggio per valore del numero di facce
	public int dadoLanciato(int facce) {
		if (facce<4 || facce>100 || facce%2!=0) {	
			System.out.println("numero facce non valido");
		}
		Random random= new Random();

		int lancio= random.nextInt(1, facce + 1);	
		System.out.println(nome + " ha lanciato un dado a " + facce+ " facce ed è uscito: " + lancio);
		return lancio;
	}

	//passaggio per riferimento dell'oggetto dado
	public int dadoLanciato (Dado dado) {
		int lancio=dado.lancia();
		System.out.println(nome + " ha lanciato un Dado con " + dado.facce + " facce ed è uscito: " + lancio);
		return lancio;
	}
}
