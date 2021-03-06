package model;

public class Dado {
	
	//modificatori di accesso: public, private, niente (stesso package)
	private int facce;
	private String colore;
	
	public Dado() {
		this.facce = 6;
		this.colore = "bianco";
	} //costruttore di default, inizia per lettera maiuscola: si deve chiamare come l'oggetto che costruisci(classe)
	
	public Dado(int facce, String colore) { //new Dado(6, bianco);
		this.facce= facce;
		this.colore = colore;
	}
	
	public int lancia() {
		double casuale = Math.random(); //valore casuale tra (0.0 < 1.0)
		//6 facce(1-6)    casuale * facce + 1 (1 - 6)
		int res = (int)(Math.random() * facce) + 1;
		return res;
	}
	
}
