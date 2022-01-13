package model;

public class Libri {

	private String titolo;
	private double prezzo;
	
	public Libri(String titolo, double prezzo) {
		this.titolo = titolo;
		this.prezzo = prezzo;
	}
	
	public String getTitolo() {
		return titolo;
	}
	
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	public double getPrezzo() {
		return prezzo;
	}
	
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	
	
}
