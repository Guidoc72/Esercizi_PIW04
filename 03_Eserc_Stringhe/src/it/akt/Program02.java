package it.akt;

import java.util.Scanner;

public class Program02 {
//Ricevete una stringa in ingresso da tastiera (Scanner)
	//Scrivi un programma che inverte l'ordine dei caratteri in una stringa e la stampa al contrario.
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("inserire una parola o una frase:");
		String stringa= scanner.nextLine();
		
		StringBuilder str = new StringBuilder(stringa);
		System.out.println(str.reverse());
		
		scanner.close();
	}

}
