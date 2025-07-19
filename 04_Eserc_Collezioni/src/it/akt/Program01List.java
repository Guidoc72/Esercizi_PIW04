package it.akt;

import java.util.ArrayList;
import java.util.List;

public class Program01List {

	public static void main(String[] args) {
		
		List <String> nomiStudenti = new ArrayList<>();
		
		nomiStudenti.add("Alice");
		nomiStudenti.add("Bob");
		nomiStudenti.add("Charlie");
		nomiStudenti.add("Alice");
		
		//stampo tutti i nomi
		for (int i = 0; i < nomiStudenti.size(); i++)								
			System.out.print(nomiStudenti.get(i) + " ");
		
		//elimino prima occorenza di alice
		nomiStudenti.remove(nomiStudenti.indexOf("Alice"));
		
		System.out.println();
		
		//ristampo con nuove modifiche
		for (int i = 0; i < nomiStudenti.size(); i++)								
			System.out.print(nomiStudenti.get(i) + " ");
		
		System.out.println();
		
		//verifica presenza di "Bob" nella lista
		if (nomiStudenti.contains("Bob")) {
			System.out.println("La lista contiene il nome Bob!");
		}
		
		//stampo dimensione attuale lista
		System.out.println("La dimensione della lista è di: " + nomiStudenti.size() + " nomi");
	}

}
