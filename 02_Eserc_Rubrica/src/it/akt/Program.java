package it.akt;

public class Program {

	public static void main(String[] args) {
		
		
	Rubrica rubrica = new Rubrica (4);		//4 contatti
	
	Contatto c1 = new Contatto ("Giulia", "Pascucci", "3568713346");
	Contatto c2= new Contatto ("Riccardo", "Rullo", "3475699123");
	Contatto c3= new Contatto ("Erika", "Rossi", "3661239440");
	Contatto c4 = new Contatto ("Marco", "Verdi", "3778122568");
	
	rubrica.aggiungiContatto(c1);
	rubrica.aggiungiContatto(c2);
	rubrica.aggiungiContatto(c3);
	rubrica.aggiungiContatto(c4);
	
	rubrica.stampaRubrica();
	
	
	}

}
