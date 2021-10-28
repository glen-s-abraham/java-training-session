class Table{
	public synchronized void printTable(int number) {
		for(int i =1;i<=10;i++)
			System.out.println(i +" x " + number+ " = " + i*number);
			try {
				Thread.sleep(400);
			}catch (Exception e) {
				e.printStackTrace();
			}
	}
}
class ThreadToPrintTable extends Thread{
	private Table table;
	private int number;
	public ThreadToPrintTable(int number) {
		this.table = new Table();
		this.number = number;
	}
	public void run() {
		table.printTable(number);
	}
}
public class ThreadSynchronization {
	public static void main(String args[]) {
		ThreadToPrintTable threadfor2 = new ThreadToPrintTable(2);
		ThreadToPrintTable threadfor10 = new ThreadToPrintTable(10);
		threadfor10.start();
		threadfor2.start();
	}
}
