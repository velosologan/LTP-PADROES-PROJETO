package br.upis.singleton;

public class Tarefa implements Runnable {

	@Override
	public void run() {
		PoolSingleton s = PoolSingleton.getInstance();
		System.out.println(s);
	}
}
