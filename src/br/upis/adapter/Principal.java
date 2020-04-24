package br.upis.adapter;

//Client
public class Principal {
	
	public static void main(String[] args) {
		
		IMensagem output = new Adapter();
		
		output.exibirMensagem("Hello World!");
		output.exibirMensagem("Hello World!");
		output.exibirMensagem("Hello World!");
		output.exibirMensagem("Hello World!");
		output.exibirMensagem("Hello World!");
		output.exibirMensagem("Hello World!");
		output.exibirMensagem("Hello World!");
		output.exibirMensagem("Hello World!");
		output.exibirMensagem("Hello World!");
	}
}
