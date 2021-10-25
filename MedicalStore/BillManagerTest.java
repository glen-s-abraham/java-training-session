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
	InventoryManager inventoryManager;
	@BeforeEach
	void setUp() {
		Inventory inventory = new Inventory();
		for(int i=1;i<=5;i++) {
			inventory.setMedecines(new Medecine(i,"Name"+i,10*i,i*100));
		}
		InventoryManager imanager = new InventoryManager(inventory);
		this.billManager=new BillManager(imanager);
	}
	@Test
	void shouldReturnTrueWhenGivenCorrectIdAndQty() {
		assertTrue(billManager.addMedecineToBill(1, 11));
	}
	@Test
	void shouldThrowFalseWhenGivenCorrectIdAndIncorrectQty() {
		assertFalse(billManager.addMedecineToBill(1, 200));
	}
	@Test
	void shouldReturnFalseWhenGivenIncorrectId() {
		assertFalse(billManager.addMedecineToBill(69, 20));
	}
	
	@Test
	void shouldReturnBillListWhenGivenCorrectBills() {
			int id=1,qty=1;
			billManager.addMedecineToBill(id,qty);
			List <Bill> result = billManager.printBill();
			for(Bill bill:result) {
				assertEquals(bill.getPurchaseQty(),qty);
				assertEquals(bill.getMedecine().getMedecineId(),id);
				assertEquals(bill.getTotalBillAmount(),bill.getMedecine().getMedecinePrice()*qty,0.00);
			}
			
			
	}

}
