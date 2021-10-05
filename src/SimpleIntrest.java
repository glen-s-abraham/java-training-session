import java.util.Scanner;

public class SimpleIntrest {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter principal");
		double p = scanner.nextDouble();
		System.out.println("Enter Years");
		double n = scanner.nextDouble();
		System.out.println("Enter rate%");
		double r = scanner.nextDouble();
		System.out.println("Simple intrest"+((p*n*r)/100));
	}
}
