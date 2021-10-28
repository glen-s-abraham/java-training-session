class Odd implements Runnable{
	public void run() {
		for(int i = 1;i<10;i+=2) {
			System.out.println(i);
			try {
				Thread.sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Even implements Runnable{
	public void run() {
		for(int i = 0;i<10;i+=2) {
			System.out.println(i);
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadSync {
 public static void main(String args[]) throws InterruptedException {
	 Thread t1=new Thread(new Odd());
	 Thread t2=new Thread(new Even());
	 t1.start();
	 t2.start();
	 
 }
}
