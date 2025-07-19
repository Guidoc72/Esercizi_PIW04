package it.akt;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		
		//inizializzo lo scanner
		Scanner scanner = new Scanner (System.in);
		
		//stampo l'input per l'utente
		System.out.println("Inserisci una parola/frase:");
		
		//per le stringhe uso nextLine() così non si ferma al primo spazio che trova tra una parola e l'altra in caso di frasi
		String str = scanner.nextLine();
		
		//metodo per rendere in minuscolo tutte le lettere
		str.toLowerCase();
		
		//uso lo StringBuilder perché rende la stringa manipolabile e mutabile
		StringBuilder builder = new StringBuilder (str);
		builder.reverse().toString(); //uso il metodo reverse() per invertire la parola/frase e poi il metodo toString() per ritrasformarla in stringa
				
		//stampo la parola/frase invertita
		System.out.println(builder);
		
		//chiudo lo scanner
		scanner.close();
		
	}

}
