import java.util.*;

public class ArithmeticExec {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Arithmetic arithmetic= new Arithmetic();
		
		System.out.println("Enter numbers");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		
		System.out.println("Sum: " + arithmetic.add(a, b));
		System.out.println("Diff: " + arithmetic.sub(a, b));
		System.out.println("Prod: " + arithmetic.mul(a, b));
		System.out.println("Quot: " + arithmetic.div(a, b));
	}
}
