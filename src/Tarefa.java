
public class Tarefa implements Runnable {

	@Override
	public void run() {
		Singleton s = Singleton.getInstance();
		System.out.println(s);
	}
}
