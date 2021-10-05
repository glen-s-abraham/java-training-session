import java.util.Scanner;

public class PassOrFail {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 3 marks");
		double m1 = scanner.nextDouble();
		double m2 = scanner.nextDouble();
		double m3 = scanner.nextDouble();
		if(m1>35 && m2>35 && m3>35)
			if((m1+m2+m3) > 108)
				System.out.println("Pass");
		else
			System.out.println("Fail");
	}
}
