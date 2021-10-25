import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MedicalStoreTest {
	private MedicalStore medicalStore;
	InventoryManager inventoryManager;
	@BeforeEach
	void setUp() {
		inventoryManager = new InventoryManager();
		for(int i=1;i<5;i++) {
			inventoryManager.addNewMedecineToInventory(i, "medecine"+i, 10, 100);
		}
		medicalStore=new MedicalStore(inventoryManager);
		
	}
	@Test
	void shouldReturnTrueWhenGivenCorrectIdAndQty() {
		boolean result = medicalStore.addMedecineToBillAndUpdateQty(1, 2);
		assertTrue(result);
	}
	@Test
	void shouldReturnFalseWhenGivenIncorrectIdAndQty() {
		boolean result = medicalStore.addMedecineToBillAndUpdateQty(1, 1000);
		assertFalse(result);
	}

}
