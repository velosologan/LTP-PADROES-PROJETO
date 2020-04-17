package br.upis.singleton;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Principal {
	public static void main(String[] args) {

		ExecutorService pool = Executors.newCachedThreadPool();
		
		for(int i = 0; i < 10; i++){
			pool.execute(new Tarefa());
		}
	}
}	
