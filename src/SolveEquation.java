import java.util.Scanner;

public class SolveEquation {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a");
		int a = scanner.nextInt();
		System.out.println("Enter b");
		int b = scanner.nextInt();
		System.out.println("(a+b)^2 = "+((a*a)+(2*a*b)+(b*b)));
	}
}
