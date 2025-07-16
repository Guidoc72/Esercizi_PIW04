package it.akt;

public class Program {

	public static void main(String[] args) {
		
		//dichiaro e inizializzo alcuni contatti
		Contatto c1 = new Contatto ("Martina", "Pascucci", "3475718721");
		Contatto c2 = new Contatto ("Luca", "Mercorelli", "3516375578");
		Contatto c3 = new Contatto ("Giulia", "Pascucci", "3661238778");
		Contatto c4 = new Contatto ("Raffaella", "Perret", "3476937133");
		
		//inserisco i contatti nell'array
		Contatto [] listaContatti = {c1, c2, c3, c4};
		
		//creo la rubrica 
		Rubrica rubrica = new Rubrica (listaContatti);
		
		//richiamo il metodo per la stampa della rubrica nella classe Rubrica
		rubrica.stampaRubrica();

	}
}
