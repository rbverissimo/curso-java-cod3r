package padroes.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {
	
	private List<ObservadorChegadaAniversariante> observadores =
			new ArrayList<>();
	
	public void registrarObservador(ObservadorChegadaAniversariante o) {
		observadores.add(o);
	}
	
	
	// esse código é implementado pelos frameworks, geralmente: 
	public void monitorar() {
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		while(!"sair".equalsIgnoreCase(valor)) {
			System.out.println("Aniversariante chegou? ");
			valor = entrada.nextLine();
			if("sim".equalsIgnoreCase(valor)) {
				// Criar o evento que será notificado para cada observador
				EventoChegadaAniversariante evento =
						new EventoChegadaAniversariante(new Date());
				// notificar os observadores
				observadores.stream()
							.forEach(o -> o.chegou(evento));
			} else System.out.println("Alarme falso");
			
		}
		
		entrada.close();
		
	}

}
