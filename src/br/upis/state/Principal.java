package br.upis.state;

public class Principal {
	public static void main(String[] args) {
		
		Data d = new Data(1, 1, 2021);

		for(int i = 0; i < 366; i++) {
			
			System.out.println(d);
			
			d.incrementaDia();
		}
	}
}
