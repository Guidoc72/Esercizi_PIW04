package it.akt;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Program03Map {

	public static void main(String[] args) {
		
		Map <String, Integer> popolazioneCitta = new HashMap <>();
		
		popolazioneCitta.put("Roma", 2800000);
		popolazioneCitta.put("Milano", 1400000);
		popolazioneCitta.put("Napoli", 900000);
		
		//stampo  popolazione Roma
		System.out.println("La popolazione di Roma è di: " + popolazioneCitta.get("Roma") + " abitanti");
		
		//aggiungo firenze
		popolazioneCitta.put("Firenze",380000);
		
		//aggiorno popolazione Milano
		popolazioneCitta.put("Milano", 1500000);

		System.out.println("===STAMPA COMPLETA===");
		
		//stampo tutte le città con relativa popolazione
		for (Entry<String, Integer> entry : popolazioneCitta.entrySet())					
			System.out.println(entry.getKey() + " " + entry.getValue());
		
		
		if (popolazioneCitta.containsKey("Napoli")) {
			System.out.println("La mappa contiene la città Napoli");
		}
		
		System.out.println("===STAMPA POPOLAZIONI>1.000.000===");
		for (Entry<String, Integer> entry : popolazioneCitta.entrySet())	
			if (entry.getValue()> 1000000) {
				System.out.println(entry.getKey() + " " + entry.getValue());
			}
		
		
		//stampa città con popolazione > 1000000
		
		
		System.out.println("===STAMPA SENZA NAPOLI===");
		
		//rimuovi napoli
		popolazioneCitta.remove("Napoli");
		
		//stampo dopo la rimozione
		for (Entry<String, Integer> entry : popolazioneCitta.entrySet())					
			System.out.println(entry.getKey() + " " + entry.getValue());
		
	}

}
