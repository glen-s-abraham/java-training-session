import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BillTest {

	@Test
	void shouldReturnBillWhenCorrectMedecineandPurchaseQty() {
		int id = 1;
		String name ="paracetamol";
		int qty =100;
		double price=10;
		Medecine medecine = new Medecine(id,name,price,qty);
		int purchaseQty = 2;
		
		double result = new Bill(medecine,purchaseQty).getTotalBillAmount();
		double expected = price*purchaseQty;
		
		assertEquals(expected,result);
		
	}
	
	@Test
	void shouldThrowExceptionWhenValuesNotSet() {
		Bill bill = new Bill();
		assertThrows(RuntimeException.class,()->bill.setTotalBillAmount());
	}

}
