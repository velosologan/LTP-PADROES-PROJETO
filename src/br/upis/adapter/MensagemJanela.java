package br.upis.adapter;

import javax.swing.JOptionPane;

//Adaptee
public class MensagemJanela {

	public void exibir(String msg, int messageType) {
		
		JOptionPane.showMessageDialog(null, msg, "Seja bem Vindo!", messageType);
	}
}
