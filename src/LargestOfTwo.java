import java.util.Scanner;

public class LargestOfTwo {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		if(a>b)
			System.out.println(a+" is larger");
		else if(b>a)
			System.out.println(b+" is larger");
		else
			System.out.println(a+","+b+ " are equal");
	}
}
