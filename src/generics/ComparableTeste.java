package generics;

import java.util.TreeSet;

public class ComparableTeste {
	public static void main(String[] args) {
		/*
		 * A classe Integer implementa a interface Comparable 
		 * Essa interface é similar ao operador spaceship do PHP
		 * ela retorna -1 para menor, 0 para igua, +1 para maior
		 * existe um método dentro do código da classe Integer, o compareTo,
		 * que ele permite que valores sejam comparáveis
		 */
		
		TreeSet<Integer> nums = new TreeSet<>();
		
		/*
		 * De forma que, ao criar um TreeSet (que precisa da implementação da interface
		 * Comparable e essa implementação estar disponível na classe Integer) ele é 
		 * capaz de organizar os números por comparação
		 * e a prova disso está logo abaixo
		 */
		
		nums.add(-2);
		nums.add(100);
		nums.add(1);
		nums.add(59);
		
		for(Integer n: nums) System.out.println(n); 
	}

}
