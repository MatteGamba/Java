package model;

public class Spesa {
	
	private static int counter = 1;
	private int id;
	private String descrizione;
	private boolean completo;
	
	
	
	
	
	public Spesa(String descrizione) {
		super();
		this.descrizione = descrizione;
		this.id = counter++;
	}

	public String getDescrizione() {
		return descrizione;
	}

	
	public int getId() {
		return id;
	}

	public boolean isCompleto() {
		return completo;
	}
	
	public void setCompleto(boolean completo) {
		this.completo = completo;
	}
}
