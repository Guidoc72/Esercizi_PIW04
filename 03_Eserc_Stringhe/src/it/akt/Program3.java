package it.akt;

public class Program3 {
	
	//dichiaro e inizializzo i campi
	private final String alfabeto = "ABCDEFGHIKJLMNOPQRSTUVWXYZ";
	private final int chiave;
	
	//istanzio il costruttore parametrico per chiave 
	public Program3(int chiave) {
		this.chiave = chiave;
	}
	
	//dichiaro il metodo cripta() che ha un valore di ritorno
	public String cripta (String testo) {
		testo = testo.toUpperCase(); //metodo per trasformare in maiuscole tutte le lettere
		StringBuilder risultato = new StringBuilder(); //uso StringBuilder per rendere modificabile la stringa
	
	//avvio un ciclo per criptare la stringa con chiave +3
		for (char c : testo.toCharArray()) { //metodo pche trasforma una stringa in un array di caratteri
			if (alfabeto.indexOf(c) != -1) { //metodo che restituisce la posizione della prima ricorrenza del carattere ricercato e se non la trova restituisce -1.
				int posizione = alfabeto.indexOf(c);
				int nuovaPosizione = (posizione + chiave) % 26; //per non farlo andare oltre le 26 lettere
				risultato.append(alfabeto.charAt(nuovaPosizione));
			} else {
				risultato.append(c);//lascia spazi e simboli invariati
			}
		}
		return risultato.toString(); //trasforma l'array di caratteri di nuovo in una stringa
	}
	
	//dichiaro il metodo decripta() che ha un valore di ritorno
	public String decripta (String testoCriptato) {
		testoCriptato = testoCriptato.toUpperCase(); 
		StringBuilder risultato =  new StringBuilder();
		
		//come il ciclo for del metodo cripta() ma sottraendo la chiave (-3)
		for (char c : testoCriptato.toCharArray()) {
			if (alfabeto.indexOf(c) != -1) {
				int posizione = alfabeto.indexOf(c);
				int nuovaPosizione = (posizione - chiave + 26) % 26;
				risultato.append(alfabeto.charAt(nuovaPosizione));
			} else {
				risultato.append(c);
			}
		}
		return risultato.toString();
	}
	
	//metodo main per stampare i metodi scritti precedentemente
	public static void main(String[] args) {
		Program3 cifrario = new Program3 (3);
		
		//dichiaro e inizializzo le diverse stringhe
		String testoOriginale = "Inviare rinforzi alla legione";
		String testoCriptato = cifrario.cripta(testoOriginale);
		String testoDecriptato = cifrario.decripta(testoCriptato);
		
		//stampo
		System.out.println("Testo originale: " + testoOriginale.toUpperCase());
		System.out.println("Testo criptato: " + testoCriptato);
		System.out.println("Testo decriptato: " + testoDecriptato);
	}
	
	}

