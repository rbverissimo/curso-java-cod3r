package swing;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {
	
	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Observador");
		
		/*
		 * m�todo baseada na Dispose on Close que diz que ao fechar a janela
		 * fecha-se tamb�m a aplica��o como um todo; 
		 */
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela.setSize(600, 200);
		
		JButton botao = new JButton("Clicar!");
		janela.add(botao);
		janela.setLayout(new FlowLayout());
		janela.setLocationRelativeTo(null); // em rela��o � janela do SO; 
		
		
		janela.setVisible(true);
	}

}
