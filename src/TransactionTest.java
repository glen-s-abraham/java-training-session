import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TransactionTest {

	Account customer;
	int id;
	String name;
	double balance;
	@BeforeEach
	void setUp() {
		id=123;
		name = "Glen";
		balance = 5000;		
		customer = new Account(id,name,balance);
	}
	@Test
	void shouldReturnBalanceWhenGivenCorrectAccount() {
		assertEquals(Transaction.viewCurrentBalance(customer),balance);
	}
	
	@Test
	void shouldDepositMoneyWhenGivenCorrectAccountandAmount() {
		double depositAmount = 5000;
		Transaction.depositMoneyToCustomerAccount(customer, depositAmount);
		assertEquals(Transaction.viewCurrentBalance(customer),balance+depositAmount);
	}
	
	@Test
	void shoudlReturnExceptionWhenGivenWithdrawalAmountGreaterthanBalance()
	{
		double withdrawalAmount = 5000;
		assertThrows(ArithmeticException.class,
				()->Transaction.withdrawMoneyFromCustomerAccount(customer, withdrawalAmount)
		);
		
	}
	
	@Test
	void shoudlReturnExceptionWhenGivenWithdrawalAmountButBalanceLessThamMinimum()
	{
		double withdrawalAmount = 500;
		customer.setBalance(20);
		assertThrows(ArithmeticException.class,
				()->Transaction.withdrawMoneyFromCustomerAccount(customer, withdrawalAmount)
		);
		
	}
	@Test
	void shouldWithdrawMoneyWhenGivenCorrectAccountandAmount() {
		double withdrawAmount = 500;
		Transaction.withdrawMoneyFromCustomerAccount(customer, withdrawAmount);
		assertEquals(Transaction.viewCurrentBalance(customer),balance-withdrawAmount);
	}

}
