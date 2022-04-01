package funzionale;

import java.util.Arrays;
import java.util.List;

public class Funzionale4 {

	public static void main(String[] args) {

		List<String> nani = Arrays.asList(
					"eolo",
					"gongolo",
					"pisolo",
					"mammolo",
					"adrianolo",
					"ziguli",
					"firuli",
					"mignolo"
				);
		
		nani.stream()
			.sorted((o1, o2) -> o2.length()- o1.length())
			.forEach(System.out::println);
				
	}

}
