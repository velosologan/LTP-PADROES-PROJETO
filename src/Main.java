
public class Main {
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			PoolSingleton s = PoolSingleton.getInstance();
			System.out.println(s);
		}
	}
}
