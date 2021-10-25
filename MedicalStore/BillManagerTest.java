import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.runners.Parameterized.Parameter;

class BillManagerTest {
	private BillManager billManager;
	@BeforeEach
	void setUp() {
		this.billManager=new BillManager();
	}
	@Test
	void shouldReturnTrueWhenGivenCorrectMedecineAndQty() {
		Medecine medecine=new Medecine(1,"Paracetamol",10,100);
		assertTrue(billManager.addMedecineToBill(medecine, 11));
	}
	
	@Test
	void shouldTrowExceptionWhenGivenCorrectMedecineAndIcorrectQty() {
		Medecine medecine=new Medecine(1,"Paracetamol",10,100);
		assertThrows(IllegalArgumentException.class,
				()->billManager.addMedecineToBill(medecine, 0));
	}
	
	@Test
	void shouldReturnTrueWhenGivenCorrectIdToDelete() {
		Medecine medecine=new Medecine(1,"Paracetamol",10,100);
		billManager.addMedecineToBill(medecine, 1);
		assertTrue(billManager.deleteMedecineFromBill(1));
	}
	
	@Test
	void shouldReturnFalseWhenGivenIncorrectIdToDelete() {
		Medecine medecine=new Medecine(1,"Paracetamol",10,100);
		billManager.addMedecineToBill(medecine, 1);
		assertFalse(billManager.deleteMedecineFromBill(2));
	}

	@Test
	void shouldReturnBillListWhenGivenCorrectBills() {
			Medecine medecine=new Medecine(1,"Paracetamol",10,100);
			int qty=1;
			billManager.addMedecineToBill(medecine,qty);
			List <Bill> result = billManager.printBill();
			for(Bill bill:result) {
				assertEquals(bill.getPurchaseQty(),qty);
				assertEquals(bill.getMedecine().getMedecineId(),medecine.getMedecineId());
				assertEquals(bill.getTotalBillAmount(),bill.getMedecine().getMedecinePrice()*qty,0.00);
			}
			
			
	}

}
