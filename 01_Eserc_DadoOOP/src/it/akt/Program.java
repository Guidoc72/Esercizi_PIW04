package it.akt;

public class Program {
	public static void main(String[] args) {
		Giocatore giocatore = new Giocatore();
		
		
		Dado d6 = new Dado(6);
		
		//passaggio per lavoro
		System.out.println("lancio 1: "  + giocatore.lanciaDado(6));
		
		//oppure
		System.out.println("lancio 2: "  + giocatore.lanciaDado(d6.getNumeroFacce()));
		
		//passaggio per riferimento
		System.out.println("lancio 1: "  + giocatore.lanciaDado(d6));
		
		
	}
}
