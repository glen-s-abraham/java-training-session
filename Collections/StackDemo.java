import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack <Integer> integerStack = new Stack<Integer>();
		integerStack.push(100);
		integerStack.push(200);
		integerStack.push(300);
		System.out.println(integerStack);
		integerStack.pop();
		System.out.println(integerStack);
		System.out.println(integerStack.peek());
		integerStack.add(0, 10);
		System.out.println(integerStack);

	}

}
