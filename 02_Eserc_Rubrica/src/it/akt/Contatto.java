package it.akt;

public class Contatto {
	private String nome;
	private String cognome;
	private String cellulare;
	
	
	public Contatto (String nome, String cognome, String cellulare) {
		this.nome=nome;
		this.cognome=cognome;
		this.cellulare=cellulare;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCellulare() {
		return cellulare;
	}

	public void setCellulare(String cellulare) {
		this.cellulare = cellulare;
	}


	@Override
	public String toString() {
		return "nome: " +nome+ ", cognome: " +cognome + ", cellulare: "  +cellulare;
	}
	
	
}
