class Greetings extends Thread{
	public void run() {
		System.out.println("Hello");
	}
}
public class ThreadWithClass {
	public static  void main(String args[]) throws InterruptedException {
		Greetings greetings = new Greetings();
		greetings.start();
		greetings.join();
		System.out.println("Main thread");

	}
	
	

}
