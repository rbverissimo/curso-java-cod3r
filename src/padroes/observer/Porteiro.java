package padroes.observer;

import java.util.ArrayList;
import java.util.List;

public class Porteiro {
	
	private List<ObservadorChegadaAniversariante> observadores =
			new ArrayList<>();
	
	public void registrarObservador(ObservadorChegadaAniversariante o) {
		observadores.add(o);
	}
	
	

}
