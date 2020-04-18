package br.upis.factorymethod;

//ConcreteCreator
public class Fiat implements MontadoraVeiculos {

	//factory method
	@Override
	public Carro criarCarro(String nomeCarro) {
		
		if(nomeCarro.equals("Marea")) {
			return new Marea();
		}
		
		if(nomeCarro.equals("Uno")) {
			return new Uno();
		}
		
		return null;
	}

}
