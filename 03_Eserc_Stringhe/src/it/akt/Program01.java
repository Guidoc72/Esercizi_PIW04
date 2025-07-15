package it.akt;

public class Program01 {

	public static void main(String[] args) {
		
	String esercizio1 = "Copiare il testo di questo esercizio in una Stringa.Contare quante volte compare la lettera e nel testo di questo esercizio e restituire l'informazione a console.";
	int conteggio=0;
	int i= esercizio1.indexOf("e");
		
	while (i !=-1)	{
		i=esercizio1.indexOf("e",i+1);
		conteggio++;
	}
	
	System.out.println("La lettera 'e' compare " +conteggio+ " volte nel testo.");
	
	}
}
