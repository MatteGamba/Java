package model;

public class Studente {
	
	private static int contatore = 1;
	private String nome;
	private int matricola;
	private String cognome;
	
	//public Studente() {}
	
	public Studente(String nome, String cognome) {
		this.matricola = contatore ++;
		this.nome = nome;
		this.cognome = cognome;
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
	
	public int getMatricola() {
		return matricola;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}

	@Override
	public String toString() {
		return "Studente: " + matricola + ") " + nome + " " + cognome ;
	}
	
	
	
	
	
}
