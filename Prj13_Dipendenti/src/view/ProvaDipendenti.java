package view;

import java.util.ArrayList;

import controller.Dipendenti;
import model.Dipendente;
import model.Dirigente;
import model.Fattorino;
import model.Impiegato;

public class ProvaDipendenti {

	public static void main(String[] args) {

		Dipendenti controller = new Dipendenti();
		
		controller.addDipendente(new Fattorino("Giuseppe", "Verdi"));
		controller.addDipendente(new Fattorino("Giuseppe", "Garibaldi"));
		controller.addDipendente(new Fattorino("Dante", "Alighieri"));
		controller.addDipendente(new Fattorino("Gioacchino", "Rossini"));
		controller.addDipendente(new Fattorino("Carlo", "Alberto"));
		
		controller.addDipendente(new Impiegato("Cristoforo", "Colombo"));
		controller.addDipendente(new Impiegato("Marco", "Polo"));
		controller.addDipendente(new Impiegato("Amerigo", "Vespucci"));
		
		controller.addDipendente(new Dirigente("Pietro", "Micca"));
		controller.addDipendente(new Dirigente("Regina", "Margherita"));
		
		ArrayList<Dipendente> libroMatricola = controller.getLibroMatricola();
		
		for (Dipendente dipendente : libroMatricola) {
			
			if (dipendente instanceof Fattorino) {
				System.out.println("E' un fattorino");
				((Fattorino)dipendente).setConsegne(100);
			}
			if (dipendente instanceof Impiegato) {
				System.out.println("E' un impiegato");
				((Impiegato)dipendente).setGiorniLavoro(20);
				if (dipendente.getMatricola() == 7) {
					((Impiegato)dipendente).setGiorniLavoro(22);
				}
			}
			
			
			
			System.out.println(dipendente);
		}
		
		System.out.println(controller.getDipendentebyId(7));
		
		
		
	}

}
