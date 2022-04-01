package controller;

import java.util.ArrayList;

import model.Spesa;

public class SpesaCtrl {

	private static ArrayList<Spesa> spesa = new ArrayList<>();

	public static void addSpesa(String desc) {
		Spesa sp = new Spesa(desc);
		spesa.add(sp);

	}
	
	public void completa(int id) {
		for (Spesa sp : spesa) {
			if(sp.getId() == id) {
				sp.setCompleto(true);
			}
		}
	}
	
	public  static ArrayList<Spesa> getSpesa() {
		return spesa;
	}
}
