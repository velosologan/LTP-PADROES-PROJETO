package br.upis.factorymethod;

//Product
public abstract class Carro {

	private String nome;
	private String cor;

	public Carro(String nome, String cor) {
		this.nome = nome;
		this.cor = cor;
	}
	
	@Override
	public String toString() {
		return this.nome + ":" + this.cor;
	}
}
