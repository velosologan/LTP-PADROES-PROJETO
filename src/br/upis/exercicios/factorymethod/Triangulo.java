package br.upis.exercicios.factorymethod;

public class Triangulo implements FiguraGeometricaBidimensional {

	private float lado1;
	private float lado2;
	private float lado3;
	
	private boolean condicaoExistencia(float a, float b, float c) {
		return Math.abs(b - c) < a && a < b + c;
	}

	public Triangulo() {
		this.lado1 = 1;
		this.lado2 = 1;
		this.lado3 = 1;
	}

	public float getLado1() {
		return lado1;
	}

	public void setLado1(float lado1) {
		if(condicaoExistencia(lado1, lado2, lado3)) {
			this.lado1 = lado1;
		}
	}

	public float getLado2() {
		return lado2;
	}

	public void setLado2(float lado2) {
		this.lado2 = lado2;
	}

	public float getLado3() {
		return lado3;
	}

	public void setLado3(float lado3) {
		this.lado3 = lado3;
	}

	@Override
	public String getTipoFigura() {
		// TODO fazer a implementação
		return "";
	}
	
	@Override
	public String toString() {
		return "["+ lado1 + ":" + lado2 + ":" + lado3 + "]";
	}
}
