
public class Principal {
	public static void main(String[] args) {
		
		Singleton1 s;

		for(int i = 0; i < 10; i++){
			
			s = Singleton1.getInstance();
			System.out.println(i + ": " + s);
			
		}
	}
}	
