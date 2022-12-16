package padroes.observer;

public class AniversarioSurpresa {
	
	public static void main(String[] args) {
		
		
		// � poss�vel instanciar o observador ou usar a interface funcional para isso
		Namorada namorada = new Namorada();
		Porteiro porteiro = new Porteiro();
		
		porteiro.registrarObservador(namorada);
		
		// registrando o Observador atrav�s do uso da interface funcional
		porteiro.registrarObservador(e -> {
			System.out.println("Surpresa via lambda!!!");
			System.out.println("Ocorreu em: " + e.getMomento());	
		});
		
		porteiro.monitorar();
	}

}
