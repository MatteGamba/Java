package model;

public class Sala {

	private static int counter = 1;
	
	private String nome;
	private int id;
	private int posti;
	private Spettacoli spettacolo;
	
	public Sala(String nome, int posti, Spettacoli spettacolo) {
		this.nome = nome;
		this.posti = posti;
		this.spettacolo = spettacolo;
		this.id = counter++;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Spettacoli getSpettacolo() {
		return spettacolo;
	}
	
	public int getPosti() {
		return posti;
	}
	
	public void setPosti(int posti) {
		this.posti = posti;
	}
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Sala [nome=");
		builder.append(nome);
		builder.append(" id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
