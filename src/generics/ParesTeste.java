package generics;

public class ParesTeste {
	public static void main(String[] args) {
		
		Pares<Integer, String> resultadoConcurso = new Pares<>();
		
		resultadoConcurso.adicionar(1, "Roberto");
		resultadoConcurso.adicionar(2, "Gui");
		resultadoConcurso.adicionar(3, "Bia");
		resultadoConcurso.adicionar(4, "João");
		resultadoConcurso.adicionar(5, "José");
		resultadoConcurso.adicionar(2, "Maria");
		
		System.out.println(resultadoConcurso.getValor(1));
		System.out.println(resultadoConcurso.getValor(2)); // Maria
	}

}
