package br.upis.adapter.exercicio;

import javax.swing.JOptionPane;

import br.upis.adapter.MensagemJanela;

public class Principal1 {
	public static void main(String[] args) {
		
		MensagemJanela mj = new Adapter();
		
		mj.exibir("Hello World!", JOptionPane.CANCEL_OPTION);
		mj.exibir("Hello World!", JOptionPane.PLAIN_MESSAGE);
		mj.exibir("Hello World!", JOptionPane.PLAIN_MESSAGE);
		mj.exibir("Hello World!", JOptionPane.PLAIN_MESSAGE);
		mj.exibir("Hello World!", JOptionPane.PLAIN_MESSAGE);
		mj.exibir("Hello World!", JOptionPane.PLAIN_MESSAGE);
		mj.exibir("Hello World!", JOptionPane.PLAIN_MESSAGE);
		mj.exibir("Hello World!", JOptionPane.PLAIN_MESSAGE);
	}
}
