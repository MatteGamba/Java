package model;

public class Prodotto {

	private int id;
	private double prezzo;
	private String desc;
	
	public Prodotto() {

	}
	
	public Prodotto(int id, double prezzo, String desc) {
		this.id = id;
		this.prezzo = prezzo;
		this.desc = desc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Prodotto [id=");
		builder.append(id);
		builder.append(", prezzo=");
		builder.append(prezzo);
		builder.append(", desc=");
		builder.append(desc);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
