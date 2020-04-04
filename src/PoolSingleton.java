
public class PoolSingleton {
	
	private static PoolSingleton instances[];
	
	private static int index;
	private static int length = 5;
	
	private PoolSingleton() {
		
	}
	
	public static PoolSingleton getInstance() {
		
		if(instances == null) {
			criarPool();
		}
		
		index = (index + 1) % length;
				
		return instances[index];
	}

	private static void criarPool() {
		instances = new PoolSingleton[length];
		
		for(int i = 0; i < length; i++) {
			instances[i] = new PoolSingleton();
		}
	}
}
