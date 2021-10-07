import java.util.*;
public class FactorialLoop {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = scanner.nextInt();
		int factorial = 1;
		while(n>0) {
			factorial *= n;
			n--;
		}
		System.out.println("Factorial = "+factorial);
	}
}
