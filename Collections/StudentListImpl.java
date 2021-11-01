import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentListImpl {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List <Student> studentList = new ArrayList<Student>();
		System.out.println("Enter limit:");
		int n = scanner.nextInt();
		for(int i =0;i<n;i++) {
			System.out.println("Enter roll:");
			int roll=scanner.nextInt();
			System.out.println("Enter name:");
			String name = scanner.next();
			studentList.add(new Student(roll,name));
		}

		for(Student student:studentList) 
			System.out.println(student.getRoll()+" "+student.getName());
		
	}

}
