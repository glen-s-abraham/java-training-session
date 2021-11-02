import java.util.PriorityQueue;

public class PriorityQueu {

	public static void main(String[] args) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(); 
		priorityQueue.offer(10);
		priorityQueue.offer(20);
		priorityQueue.offer(30);
		priorityQueue.offer(40);
		System.out.println(priorityQueue);
		System.out.println(priorityQueue.peek());
		priorityQueue.poll();
		System.out.println(priorityQueue);
		
	}

}
