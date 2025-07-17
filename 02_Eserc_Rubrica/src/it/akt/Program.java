package it.akt;

public class Program {

	public static void main(String[] args) {
		 
		        // Creo la rubrica
		        Rubrica miaRubrica = new Rubrica();

		        // Creo alcuni contatti
		        Contatto c1 = new Contatto("Mario", "Cicala", "3331234567");
		        Contatto c2 = new Contatto("Luca", "Talons", "3387654321");
		        Contatto c3 = new Contatto("Anna", "Pepe", "3291112222");

		        // Aggiungo i contatti alla rubrica
		        miaRubrica.aggiungiContatto(c1);
		        miaRubrica.aggiungiContatto(c2);
		        miaRubrica.aggiungiContatto(c3);

		        // Stampo la rubrica
		        miaRubrica.stampaRubrica();
		    }	

	}


