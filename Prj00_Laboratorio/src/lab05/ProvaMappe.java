package lab05;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ProvaMappe {

	public static void main(String[] args) {

		//   Set     List
		Map<String, String[]> capoluoghi = new TreeMap<>();
		
		capoluoghi.put("Piemonte", new String[] {"Torino", "Asti", "Cuneo"});
		capoluoghi.put("Lombardia", new String[] {"Milano", "Brescia", "Como"});
		capoluoghi.put("Lazio", new String[] {"Roma", "Frosinone", "Ostia"});
		
		Set<String> keySet = capoluoghi.keySet();
		Collection<String[]> tuttiComuni = capoluoghi.values();
		
		for (String[] strings : tuttiComuni) {
			System.out.println(strings);
		}
		
		for (String regione : keySet) {
			System.out.println(regione);
			
			
			List<String> comuni = Arrays.asList(capoluoghi.get(regione));
			Collections.sort(comuni);
			
			for (String comune : comuni) {
				System.out.println("\t" + comune);
			}
			
			
		}
		
	}

}
