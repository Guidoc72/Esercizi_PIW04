package it.akt;

public class Program1 {

	public static void main(String[] args) {
		
		//inizializzo e dichiaro la stringa
		String frase = new String ("Copiare il testo di questo esercizio in una Stringa. Contare quante volte compare la lettera 'e' nel testo di questo esercizio e restituire l'informazione a console");
		
		//rimuovo gli spazi
		frase.replaceAll(" ", "");
		
		//tolgo le maiuscole
		frase.toLowerCase();
		
		//inizializzo il contatore della lettera 'e'
		int conteggioE = 0;
		
		//avvio un ciclio per il conteggio delle 'e' con la condizione: se la lettera della frase è uguale a 'e' incremento il contatore della lettera 'e' fino alla fine della frase
		for (int i = 0; i < frase.length(); i++) {
			char lettera = frase.charAt(i);
			if (lettera == 'e') {
				conteggioE ++;
			}
		} 
		
		//stampo quante volte la lettera 'e' compare nella frase
		System.out.println("La lettera 'e' compare: " + conteggioE + " volte nella frase.");
		
	}

}
