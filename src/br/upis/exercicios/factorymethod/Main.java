package br.upis.exercicios.factorymethod;

public class Main {
	public static void main(String[] args) {
		
		Triangulo t = new Triangulo();
		
		System.out.println(t);
		
		t.setLado1(1.2f);
		
		System.out.println(t);
	}
}
