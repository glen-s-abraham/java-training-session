
public class Transaction {
	public static double viewCurrentBalance(Account customer) {
		return customer.getBalance();
	}
	
	public static void depositMoneyToCustomerAccount(
			Account customer,
			double depositAmount
	) {
		customer.setBalance(depositAmount+customer.getBalance());
	}
	
	public static void withdrawMoneyFromCustomerAccount(
			Account customer,
			double withdrawalAmount
	) {
		if(customer.getBalance() < 100 || customer.getBalance()-withdrawalAmount <= 0) 
			throw new ArithmeticException("Insufficient Funds");
		customer.setBalance(customer.getBalance()-withdrawalAmount);
	}
}
