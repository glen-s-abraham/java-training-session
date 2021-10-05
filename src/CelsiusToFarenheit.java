import java.util.Scanner;

public class CelsiusToFarenheit {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Celsius:");
		double celsius = scanner.nextDouble();
		System.out.println("Farenheit"+(celsius*(9/5)+32));
	}
}
