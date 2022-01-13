package controller;

import java.util.ArrayList;

import model.Libri;

public class LibriCtrl {

	private ArrayList<Libri> libri;

	public LibriCtrl() {
		this.libri = new ArrayList<Libri>();
		init();
	}
	
	public void init() {
		
		this.libri.add(new Libri("La coscienza di Zeno", 15));
		this.libri.add(new Libri("Vita e miracoli", 12));
		this.libri.add(new Libri("Ci risiamo", 17));
		this.libri.add(new Libri("Bye Bye", 12));
		this.libri.add(new Libri("Multiverso", 20));
		
	}
	
	public void addLibro(String titolo, double prezzo) {
		
		Libri l = new Libri(titolo, prezzo);
		libri.add(l);
	}
	
	public ArrayList<Libri> getLibri() {
		return libri;
	}
	
}
