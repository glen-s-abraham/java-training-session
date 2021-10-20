/*TODO
 * Add validations for fileds
*/
public class Account {

	private int customerId;
	private String customerName;
	private double customerBalance;
	
	public Account() {};
	
	public Account(int id, String name, double balance) {
		this.customerId=id;
		this.customerName=name;
		this.customerBalance=balance;
	}
	
	public void setId(int id) {
		this.customerId=id;
	}
	public void setName(String name) {
		this.customerName=name;
	}
	public void setBalance(double balance) {
		this.customerBalance=balance;
	}
	public int getId() {
		return this.customerId;
	}
	public String getName() {
		return this.customerName;
	}
	public double getBalance() {
		return this.customerBalance;
	}
}
