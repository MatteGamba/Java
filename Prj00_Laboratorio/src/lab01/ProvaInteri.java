package lab01;

public class ProvaInteri {
		
	public static void main(String[] args) {
		
		int a;//dichiarazione
		int b = 3; //dichiarazione e inizializzazione
		
		a = 4;//inizializzazione
		b = 4; //è una var posso cambiare valore
		
		final int RIGHE = 10;
		final int COLONNE = 10;
		
		for (int i = 0; i <= RIGHE; i++) {
			
			//innestare un secondo ciclo for
			for (int j = 1; j < COLONNE; j++) {
				System.out.print(i * j + "\t");
			}
			System.out.println();
		
			
		}
		
		
		
		
		
		
//		if (a == b) {//tra tipi primitivi confronto in valore
//			System.out.println("sono uguali");
//		}else {
//			System.out.println("sono diversi");
//		}
		
	}

}
