class Table2{
	public static synchronized void printTable(int number) {
		
			for(int i =1;i<=10;i++)
				System.out.println(i +" x " + number+ " = " + i*number);
				try {
					Thread.sleep(400);
				}catch (Exception e) {
					e.printStackTrace();
				}
			
	}
}

class ThreadToPrintTable3 extends Thread{
	private int number;
	public ThreadToPrintTable3(int number) {
		this.number = number;
	}
	public void run() {
		Table2.printTable(number);
	}
}
public class StaticSynchronization {
	public static void main(String args[]) {
		ThreadToPrintTable3 threadfor2 = new ThreadToPrintTable3(2);
		ThreadToPrintTable3 threadfor10 = new ThreadToPrintTable3(10);
		threadfor10.start();
		threadfor2.start();
	}
}
