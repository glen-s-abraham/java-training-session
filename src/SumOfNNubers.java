import java.util.Scanner;

public class SumOfNNubers {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = scanner.nextInt();
		int sum = 0;
		while(n>=0) {
			sum += n;
			n--;
		}
		System.out.println("Sum = "+sum);
	}
}
