package view;

import controller.GestioneConto;
import model.Cliente;
import model.ContoCorrente;

public class DemoBanca {

	public static void main(String[] args) {

		GestioneConto gc = new GestioneConto();
		
		gc.addCliente("Christian", "De La Fuente", "1999-05-31");
		
		Cliente c = gc.getCliente("Christian", "De La Fuente");
		
		gc.apriConto(c);
		
		ContoCorrente conto = gc.getConto(1);
		
		gc.faiVersamento(1342, conto);
		gc.faiVersamento(1100, conto);
		gc.faiPrelievo(200, conto);
		gc.faiPrelievo(208, conto);
		
		System.out.println(conto);
		
	}

}
