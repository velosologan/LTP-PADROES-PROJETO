package br.upis.factorymethod;

public class Main {
	public static void main(String[] args) {
		
		MontadoraVeiculos montadora;
		
		montadora = new Fiat();
		
		Carro c;
		
		c = montadora.criarCarro("Uno");
		
		System.out.println(c);
		
		c = montadora.criarCarro("Marea");
		
		System.out.println(c);
		
	}
}
