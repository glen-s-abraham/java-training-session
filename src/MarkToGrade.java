import java.util.Scanner;

public class MarkToGrade {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 3 marks");
		double m1 = scanner.nextDouble();
		double m2 = scanner.nextDouble();
		double m3 = scanner.nextDouble();
		double avg = (m1+m2+m3)/3;
		if(avg>90 && avg<=100)
			System.out.println("A+");
		else if(avg>80 && avg<=90)
			System.out.println("A");
		else if(avg>70 && avg<=80)
			System.out.println("B+");
		else if(avg>60 && avg<=70)
			System.out.println("B");
		else if(avg>50 && avg<=60)
			System.out.println("C+");
		else if(avg>40 && avg<=50)
			System.out.println("C");
		else if(avg<=40)
			System.out.println("D");
		else
			System.out.println("Invalid Marks");
	}
}
