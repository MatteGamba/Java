package view;

import controller.DoniCtrl;

public class DemoDoni {

	public static void main(String[] args) {

		DoniCtrl controller = new DoniCtrl();
		
		controller.aggiungiBabbo("Babbo pippo");
		controller.aggiungiSacco(1);
		
		controller.aggiungiDono("trenino", 0.5);
		
		controller.aggiungiDono("\n" + "bambola", 0.4);
		
		controller.aggiungiDono("\n" +"palla", 0.3);
		
		controller.aggiungiDono("\n" +"videogame", 0.2);
		
		controller.aggiungiDono("\n" +"trenino", 0.5);
		
		controller.aggiungiDono("\n" +"bambola", 0.4);
		
		controller.aggiungiDono("\n" +"palla", 0.3);
		
		controller.aggiungiDono("\n" +"videogame", 0.2);
		
		controller.aggiungiDono("\n" +"trenino", 0.5);
		
		controller.aggiungiDono("\n" +"bambola", 0.4);
		
		controller.aggiungiDono("\n" +"palla", 0.3);
		
		controller.aggiungiDono("\n" +"videogame", 0.2);
		
		controller.assegnaSacco();
		
		String contenuto = controller.getBabbo().getSacco().etichetta();
		System.out.println(contenuto);
		
		double pesoSacco = controller.getPesoSacco();
		
		System.out.println("Il sacco di " + controller.getBabbo().getNome() + " pesa " + pesoSacco + "Kg");
		
		
	}

}
