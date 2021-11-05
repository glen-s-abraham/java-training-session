import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class EmployeeStruct{
	private int empId;
	private String name;
	public EmployeeStruct(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "EmployeeStruct [empId=" + empId + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(empId,name);
	}
	@Override
	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		EmployeeStruct other = (EmployeeStruct) obj;
//		return empId == other.empId && Objects.equals(name, other.name);
		EmployeeStruct other = (EmployeeStruct)obj;
		return this.hashCode()==other.hashCode();
	}
	
	
	
}
public class EmployeeSet {

	public static void main(String[] args) {
		Set <EmployeeStruct> employeeSet = new HashSet<>();
		employeeSet.add(new EmployeeStruct(1, "Germi"));
		employeeSet.add(new EmployeeStruct(2, "Joshua"));
		employeeSet.add(new EmployeeStruct(3, "Jake"));
		employeeSet.add(new EmployeeStruct(4, "June"));
		employeeSet.add(new EmployeeStruct(4, "June"));
		employeeSet.add(new EmployeeStruct(3, "Jake"));
		printList(employeeSet);

	}
	public static void printList(Set<EmployeeStruct> list) {
		for(EmployeeStruct employee:list)
			System.out.println(employee.getEmpId()+" "+employee.getName());
	}

}
