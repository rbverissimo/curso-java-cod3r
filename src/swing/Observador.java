package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		
		// maneira mais antiga de criar algo para reagir ao bot�o:
		botao.addActionListener(new ActionListener() {
			// a API do Java cria uma classe an�nima para implementar a interface
			public void actionPerformed(ActionEvent e) {
				System.out.println("Evento aconteceu!");
				
			}
		});
		
		// maneira moderna, usando lambda, j� que � uma interface funcional: 
		botao.addActionListener(e -> 
			{System.out.println("Evento ocorreu com lambda!!!!");});
		
		// detalhe que o evento performa melhor com lambda do que classe an�nima;
		
		
		janela.setVisible(true);
	}

}
