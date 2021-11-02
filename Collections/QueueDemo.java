import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue <Integer> integerQueue = new LinkedList<Integer>();
//		integerQueue.add(10);
//		integerQueue.add(20);
//		integerQueue.add(30);
//		integerQueue.add(40);
		integerQueue.offer(10);
		integerQueue.offer(20);
		integerQueue.offer(30);
		integerQueue.offer(40);
		System.out.println(integerQueue);
		System.out.println(integerQueue.peek());
		integerQueue.poll();
		integerQueue.element();
		System.out.println(integerQueue);
		
		

	}

}
