package it.akt;

public class Cifrario {
	public int chiave;
		
	public Cifrario(int chiave) {
		this.chiave = chiave %26;		//deve rientrare tra 0 e 25 (lettere alfabeto=26)
		if (this.chiave<0) {
			this.chiave +=26;
		}
	}
		
		//metodo per criptare un testo
		public String cripta(String testoOriginale) {
			StringBuilder risultato= new StringBuilder();
			
			for (char c: testoOriginale.toCharArray()) {						//trasformo la stringa in un array
				if (Character.isUpperCase(c)) {								
					char criptato= (char) ((c - 'A' +chiave) %26 + 'A');		//cripta aggiungendo +3
					risultato.append(criptato);
				}else if (Character.isLowerCase(c)) {
					char criptato= (char) ((c - 'a' +chiave) %26 + 'a');
					risultato.append(criptato);
				} else {
					risultato.append(c);										//rimangono inviariati numeri, spazi e simboli
				}
			}
			return risultato.toString();
		}
		
		//metodo per decriptare testo
		public String decripta(String criptato) {
				StringBuilder risultato= new StringBuilder();
				
				for (char c: criptato.toCharArray()) {
					if (Character.isUpperCase(c)){
						char decriptato= (char) ((c - 'A' -chiave+26) %26 + 'A');		//decifra sottraendo -3
						risultato.append(decriptato);
					} else if (Character.isLowerCase(c)) {
						char decriptato= (char) ((c -'a' -chiave+26) % 26 +'a');		//si mette +26 per evitare valori negativi
						risultato.append(decriptato);
					}else {
						risultato.append(c);											//inviariati numeri, spazi e simboli
					}
				}
				return risultato.toString();
		}		
}
