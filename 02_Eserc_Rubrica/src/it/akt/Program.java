package it.akt;

public class Program {

	public static void main(String[] args) {
		
		
	Rubrica rubrica = new Rubrica (10);		//10 contatti
	
	Contatto c1 = new Contatto ("Giulia", "Pascucci", "3568713346");
	Contatto c2 = new Contatto ("Riccardo", "Rullo", "3475699123");
	Contatto c3 = new Contatto ("Erika", "Rossi", "3661239440");
	Contatto c4 = new Contatto ("Marco", "Verdi", "3778122568");
	Contatto c5 = new Contatto (" ", " ", " ");
	Contatto c6 = new Contatto (" ", " ", " ");
	Contatto c7 = new Contatto (" ", " ", " ");
	Contatto c8 = new Contatto (" ", " ", " ");
	Contatto c9 = new Contatto (" ", " ", " ");
	Contatto c10 = new Contatto (" ", " ", " ");
	Contatto c11 = new Contatto (" ", " ", " ");
	
	rubrica.aggiungiContatto(c1);
	rubrica.aggiungiContatto(c2);
	rubrica.aggiungiContatto(c3);
	rubrica.aggiungiContatto(c4);
	rubrica.aggiungiContatto(c5); 		
	rubrica.aggiungiContatto(c6);
	rubrica.aggiungiContatto(c7);
	rubrica.aggiungiContatto(c8);
	rubrica.aggiungiContatto(c9);
	rubrica.aggiungiContatto(c10);
	rubrica.aggiungiContatto(c11);		//mi darà errore perchè la rubrica può contenere solo 10 contatti
	
	rubrica.stampaRubrica();
	
	
	}

}
