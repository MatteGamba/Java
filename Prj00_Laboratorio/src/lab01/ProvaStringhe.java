package lab01;

import java.util.Iterator;

public class ProvaStringhe {

	public static void main(String[] args) {
		
		String nome = "matteo";
		System.out.println(nome);
		System.out.println(nome.toUpperCase());
		System.out.println(nome.equals("pippo"));
		System.out.println(nome.equalsIgnoreCase("mAtTeO"));
		System.out.println(nome.length());
		System.out.println(nome.charAt(nome.length() - 1));
		
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
	}

}
