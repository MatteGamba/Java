package lab05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ListaProdotti {

	public static void main(String[] args) {

		List<Prodotto> prodottiList = new ArrayList<Prodotto>();
		
		prodottiList.add(new Prodotto("Pigiama", 10, 3));
		prodottiList.add(new Prodotto("Maglietta gialla", 12, 2));
		prodottiList.add(new Prodotto("Pantaloni verdi", 8, 8));
		prodottiList.add(new Prodotto("Pantaloni verdi", 8, 8));
		prodottiList.add(new Prodotto("Giacca leopardata", 80, 5));
		prodottiList.add(new Prodotto("Cappotto cammello", 74, 9));
		
		Collections.sort(prodottiList);
		
		Collections.sort(prodottiList, (o1, o2) -> o2.colpodifulmine - o1.colpodifulmine);
		
		
		prodottiList.forEach(p -> System.out.println(p)); //lambda expr -> -- arrow function =>
		
		
		
		
	}

}
