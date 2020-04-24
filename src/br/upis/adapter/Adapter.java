package br.upis.adapter;

import javax.swing.JOptionPane;

//Adapter
public class Adapter implements IMensagem { 
	
	@Override
	public void exibirMensagem(String msg) {
		MensagemJanela j = new MensagemJanela();
		j.exibir(msg, JOptionPane.PLAIN_MESSAGE);
	}

}
