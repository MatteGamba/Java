package model;

public class Todo {

	private boolean completo;
	private String descrizione;
	
	public Todo(String descrizione) {//new Todo("pane")
		this.descrizione = descrizione;
		this.completo = false;
		// System.out.println("hai costruito una nuova nota");
	}

	//getters: permettono di ottenere il valore delle proprietà
	
	public boolean isCompleto() {
		return completo;
	}

	public void setCompleto(boolean completo) {
		this.completo = completo;
	}

	public String getDescrizione() {
		return descrizione.toUpperCase();
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	
	
}
