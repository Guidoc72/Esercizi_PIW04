package it.akt;

public class Contatto {
	
	//campi
	private String nome;
	private String cognome;
	private String cellulare;
	
	//costruttore parametrico
	public Contatto (String nome, String cognome, String cellulare) {
		this.nome = nome;
		this.cognome = cognome;
		this.cellulare = cellulare;
	}
	
	//metodi getter e setter
	public String getNome() {
		return nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}
	
	public void setCognome (String cognome) {
		this.cognome = cognome;
	}
	
	public String getCellulare() {
		return cellulare;
	}
	
	public void setCellulare (String cellulare) {
		this.cellulare = cellulare;
	}
	
	//metodo per stampare i contatti
	public void stampaContatto() {
		System.out.println("Nome: " + nome + " Cognome: " + cognome + " Cellulare: " + cellulare);
	}
	
}
