class Employee{
	//Variables unique to each object are declared non static
	int empId;
	double salary;
	//variables common to class objects can be declared static
	static String ceo;
	//initialize static variables.Loaded into class memory.
	static{
		ceo = "Dhamane";
	}
	//initializes class members unique to objects.Loaded into the heap memory
	public Employee(int empId,double salary) {
		this.empId = empId;
		this.salary = salary;
	}
	public void showEmployeeDetails() {
		System.out.println(this.empId+":"+this.salary+":"+this.ceo);
	}
	
	
}
public class StaticDemo {
	public static void main(String[] args) {
		Employee varun = new Employee(1,30000);
		Employee rinita = new Employee(2,40000);
		varun.showEmployeeDetails();
		rinita.showEmployeeDetails();
	}

}
