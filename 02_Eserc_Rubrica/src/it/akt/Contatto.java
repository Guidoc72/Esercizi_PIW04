package it.akt;

public class Contatto {
	public String nome;
	public String cognome;
	public String cellulare;
	
	
	public Contatto (String nome, String cognome, String cellulare) {
		this.nome=nome;
		this.cognome=cognome;
		this.cellulare=cellulare;
	}
	
	
	@Override
	public String toString() {
		return "nome: " +nome+ ", cognome: " +cognome + ", cellulare: "  +cellulare;
	}
	
	
}
