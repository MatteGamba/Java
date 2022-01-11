package lab03;

public class Studente {
	
	private static int contatore = 1;
	private String nome;
	private int matricola;
	
	//public Studente() {}
	
	public Studente(String nome) {
		this.matricola = contatore ++;
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricola() {
		return matricola;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}

	@Override
	public String toString() {
		return "Studente: " + matricola + ") " + nome + "";
	}
	
	
	
	
	
}
