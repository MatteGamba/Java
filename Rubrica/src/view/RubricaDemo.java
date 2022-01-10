package view;

import controller.RubricaController;
import model.Contatto;

public class RubricaDemo {

	public static void main(String[] args) {

		RubricaController ctrl = new RubricaController();
		ctrl.addContatto("Pippo", "349589746" );
		ctrl.addContatto("Pluto", "54654464" );
		ctrl.addContatto("Topolino", "5654654" );
		ctrl.addContatto("Minnie", "546546546" );
		ctrl.addContatto("Pippo", "349589746" );
		ctrl.addContatto("Pluto", "54654464" );
		ctrl.addContatto("Topolino", "5654654" );
		ctrl.addContatto("Minnie", "546546546" );
		ctrl.addContatto("Pippo", "349589746" );
		ctrl.addContatto("Pluto", "54654464" );
		
//		for (int i = 0; i < ctrl.getContatti().length; i++) {
//			System.out.println(ctrl.getContatti()[i]);
//		}
		
		for (Contatto c : ctrl.getContatti()) {
			System.out.println(c);
		}
		
	}

}
