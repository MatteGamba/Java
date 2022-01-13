package model;

public class Cliente {

	private String nome;
	private String cognome;
	private int eta;
	
	public Cliente(String nome, String cognome, int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
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

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(nome);
		builder.append(" ");
		builder.append(cognome);
		builder.append(", età ");
		builder.append(eta + " anni");
		builder.append(", ha un saldo di ");
		return builder.toString();
	}
	
	
	
	
	
}
