package it.akt;

import java.util.HashSet;
import java.util.Set;

public class Program02Set {

	public static void main(String[] args) {
		
		Set <Integer> numeriUnici = new HashSet <>();
		
		numeriUnici.add(10);
		numeriUnici.add(20);
		numeriUnici.add(10);
		numeriUnici.add(30);
		numeriUnici.add(40);
		numeriUnici.add(20);
		
		//stampa set (non ammette duplicati
		for ( int numero : numeriUnici) {
			System.out.print(numero + " ");
		}

		System.out.println();
		
		//verifica presenza del numero 30 
		if (numeriUnici.contains(30)) {
			System.out.println("Il set contiene il numero 30!");
		}
		
		numeriUnici.remove(40);
		//ristampa set dopo rimozione
		for ( int numero : numeriUnici) {
			System.out.print(numero + " ");
		}
		
		System.out.println();
		
		//pulisco tutto il set
		numeriUnici.clear();
		if (numeriUnici.isEmpty()) {
			System.out.println("Il set è vuoto");
		}
		
	}

}
