package br.upis.adapter.exercicio;

import javax.swing.JOptionPane;

import br.upis.adapter.MensagemConsole;
import br.upis.adapter.MensagemJanela;

public class Adapter extends MensagemJanela {

	@Override
	public void exibir(String msg, int messageType) {
		MensagemConsole mc = new MensagemConsole();
		
		if (messageType == JOptionPane.PLAIN_MESSAGE) {
			msg = "PLAIN MESSAGE: " + msg; 
		}else {
			msg = "TYPE NOT RECOGNIZE: " + msg;
		}
		
		mc.exibirMensagem(msg);
	}
}
