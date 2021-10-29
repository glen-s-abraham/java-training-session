class Table1{
	public void printTable(int number) {
		synchronized (this) {
			for(int i =1;i<=10;i++)
				System.out.println(i +" x " + number+ " = " + i*number);
				try {
					Thread.sleep(400);
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
	}
}

class ThreadToPrintTable1 extends Thread{
	private Table table;
	private int number;
	public ThreadToPrintTable1(int number) {
		this.table = new Table();
		this.number = number;
	}
	public void run() {
		table.printTable(number);
	}
}

class ThreadToPrintTable2 extends Thread{
	private Table table;
	private int number;
	public ThreadToPrintTable2(int number) {
		this.table = new Table();
		this.number = number;
	}
	public void run() {
		table.printTable(number);
	}
}
public class SynchronizedBlock {
	public static void main(String args[]) {
		ThreadToPrintTable1 threadfor2 = new ThreadToPrintTable1(2);
		ThreadToPrintTable2 threadfor10 = new ThreadToPrintTable2(10);
		threadfor10.start();
		threadfor2.start();
	}
}
