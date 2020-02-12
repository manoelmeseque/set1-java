package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		Set<String> set1 = new HashSet();
		
		//ordena
		Set<String> set2 = new TreeSet();
		
		//mostra os elementos na ordem em que são adicionados
		Set<String> set3 = new LinkedHashSet();
		
		set1.add("Tv");
		set1.add("Computador");
		set1.add("Celular");
		
		System.out.println(set1);
		//limpa os elementos
		set1.clear();
		System.out.println(set1);
		
		set2.add("Tv");
		set2.add("Computador");
		set2.add("Celular");
		
		System.out.println(set2.size());
		System.out.println(set2);
		
		set3.add("Tv");
		set3.add("Computador");
		set3.add("Celular");
		
		System.out.println("Possue computador? " + set3.contains("Computador"));
		System.out.println(set3);
		//remove todos os elementos que começão com a letra c
		set3.removeIf(x -> x.charAt(0) == 'C');
		System.out.println(set3);

	}

}
