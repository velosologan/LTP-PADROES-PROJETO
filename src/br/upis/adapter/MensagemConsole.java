package br.upis.adapter;

public class MensagemConsole implements IMensagem {

	@Override
	public void exibirMensagem(String msg) {
		System.out.println(msg);
	}
}
