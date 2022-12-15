package generics;

import java.util.List;

public class ListaUtil {
	
	public static Object getUltimo1(List<?> lista) {
		return lista.get(lista.size() - 1); 
	}
	
	/*
	 * a construção abaixo garante tipagem segura na passagem do tipo via Generics
	 * dessa forma não é necessário se preocupar com o casting dos tipos 
	 */
	public static <T> T getUltimo2(List<T> lista) {
		return lista.get(lista.size() - 1); 
	}

}
