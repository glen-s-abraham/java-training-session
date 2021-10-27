class Greeting implements Runnable{

	@Override
	public void run() {
		System.out.println("Hello");
		
	}
	
}
public class ThreadWithInterface {

	public static void main(String args[]) {
		Thread thread = new Thread(new Greeting());
		thread.start();
		System.out.println("Main thread");
	}
}
