import java.util.Scanner;

public class FarenheitToCelsius {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Farenheit:");
		double farenheit = scanner.nextDouble();
		System.out.println("Celsius:"+ (double)5/9*(farenheit-32));
	}
}
