package it.akt;

public class Program {

	public static void main(String[] args) {
		
		Contatto c1 = new Contatto("Luca","Mercorelli","3516375578");
		Contatto c2 = new Contatto("Fabio","Mercorelli","3475678546");
		Contatto c3 = new Contatto("Stefano","Mercorelli","3476574678");	

	Contatto[] listaContatti = {c1, c2, c3};
	
	Rubrica rubrica = new Rubrica(listaContatti);
	
	rubrica.stampaRubrica();
	
	}
}
