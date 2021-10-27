class Odd implements Runnable{
	public void run() {
		for(int i = 1;i<10;i+=2) {
			System.out.println(i);
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
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
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
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
