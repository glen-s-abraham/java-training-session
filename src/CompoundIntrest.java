import java.util.Scanner;
import java.lang.Math;

public class CompoundIntrest {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter principal");
		double p = scanner.nextDouble();
		System.out.println("Enter Years");
		double n = scanner.nextDouble();
		System.out.println("Enter rate%");
		double r = scanner.nextDouble();
		System.out.println("Final Amount"+(p*(Math.pow((1+(r/100)), n))));
	}
}
