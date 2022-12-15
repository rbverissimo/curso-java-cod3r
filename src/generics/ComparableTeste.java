package generics;

import java.util.TreeSet;

public class ComparableTeste {
	public static void main(String[] args) {
		/*
		 * A classe Integer implementa a interface Comparable 
		 * Essa interface � similar ao operador spaceship do PHP
		 * ela retorna -1 para menor, 0 para igua, +1 para maior
		 * existe um m�todo dentro do c�digo da classe Integer, o compareTo,
		 * que ele permite que valores sejam compar�veis
		 */
		
		TreeSet<Integer> nums = new TreeSet<>();
		
		/*
		 * De forma que, ao criar um TreeSet (que precisa da implementa��o da interface
		 * Comparable e essa implementa��o estar dispon�vel na classe Integer) ele � 
		 * capaz de organizar os n�meros por compara��o
		 * e a prova disso est� logo abaixo
		 */
		
		nums.add(-2);
		nums.add(100);
		nums.add(1);
		nums.add(59);
		
		for(Integer n: nums) System.out.println(n); 
	}

}
