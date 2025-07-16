package it.akt;

public class Program03 {

	public static void main(String[] args) {
		
		//Scrivi un programma che simuli il cifrario di Cesare con chiave +3
		//Il cifrario di Cesare sposta di n posizioni ogni lettera. Per decifrarlo si dovrà effettuare 
		//l'operazione inversa. Avrete quindi bisogno di un classe adeguata che contenga i campi necessari
		//e i metodi cripta(...) e decripta(...)
		//ABCDEFGHIJKLMNOPQRSTUVWXYZ
		//DEFGHIJKLMNOPQRSTUVWXYZABC
		//Esempio: CIAO  -->  FLDR
		//"Inviare rinforzi alla legione"
		
		Cifrario cesare = new Cifrario (3);
		String testoOriginale = "Inviare rinforzi alla legione";
		String criptato = cesare.cripta(testoOriginale);
		String decriptato = cesare.decripta(criptato);
		
		System.out.println("Testo non criptato: " + decriptato);
		System.out.println("testo criptato: " + criptato);
	}
}
