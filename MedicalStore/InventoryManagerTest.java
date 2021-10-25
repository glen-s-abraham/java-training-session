import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class InventoryManagerTest {
	InventoryManager inventoryManager;
	@BeforeEach
	void setUp() {
		Inventory inventory = new Inventory();
		inventoryManager = new InventoryManager(inventory);
	}
	@ParameterizedTest
	@CsvSource({"1,paracetamol,10,100"})
	void shouldReturnMedecineWhenPassedInCorrectParameters(int id, String name,
			double price, int qty) {
		
		Medecine expected = new Medecine(id,name,price,qty); 
		Medecine result = inventoryManager.createNewMedecine(id, name, price, qty);
		
		assertAll(
				()->assertEquals(expected.getMedecineId(),result.getMedecineId()),
				()->assertEquals(expected.getMedecinePrice(),result.getMedecinePrice()),
				()->assertEquals(expected.getMedecineName(),result.getMedecineName()),
				()->assertEquals(expected.getMedecineStockQty(),result.getMedecineStockQty())	
		);
	}
	@ParameterizedTest
	@CsvSource({"1,paracetamol,10,100"})
	void shouldReturnTrueWhenPassedInCorrectParameters(int id, String name,
			double price, int qty) {
		boolean result = inventoryManager.addNewMedecineToInventory(id, name, price, qty);
		assertTrue(result);
	}
	
	@ParameterizedTest
	@CsvSource({
		"1,paracetamol,10,100",
		"2,dolo,8,100",
		"3,covaxin,700,200"
	})
	void shouldReturnMedecineWhenPassedCorrectId(int id, String name,
			double price, int qty) {
		inventoryManager.addNewMedecineToInventory(id, name, price, qty);
		assertAll(
				()->assertEquals(inventoryManager.getMedecineById(id).getMedecineId(),id),
				()->assertEquals(inventoryManager.getMedecineById(id).getMedecineName(),name),
				()->assertEquals(inventoryManager.getMedecineById(id).getMedecinePrice(),price),
				()->assertEquals(inventoryManager.getMedecineById(id).getMedecineStockQty(),qty)
		);
	}
	
	@ParameterizedTest
	@CsvSource({
		"1,paracetamol,10,100,69",
		"2,dolo,8,100,69",
		"3,covaxin,700,200,69"
	})
	void shouldReturnNullWhenPassedCorrectId(int id, String name,
			double price, int qty, int fakeId) {
		inventoryManager.addNewMedecineToInventory(id, name, price, qty);
		assertEquals(inventoryManager.getMedecineById(fakeId),null);
	}
	
	@ParameterizedTest
	@CsvSource({
		"1,paracetamol,10,100",
	})
	void shouldReturnTruWhenPassedCorrectIdandQty(int id, String name,
			double price, int qty) {
		inventoryManager.addNewMedecineToInventory(id, name, price, qty);
		boolean result = inventoryManager.findMedecineByIdandUpdateQty(id, 5);
		assertTrue(result);
	}
	
	@ParameterizedTest
	@CsvSource({
		"1,paracetamol,10,100",
	})
	void shouldThrowExceptionWhenPassedWrongQty(int id, String name,
			double price, int qty) {
		inventoryManager.addNewMedecineToInventory(id, name, price, qty);
		assertThrows(IllegalArgumentException.class,
				()->inventoryManager.findMedecineByIdandUpdateQty(id, -1));
		
	}
	
	@ParameterizedTest
	@CsvSource({
		"1,paracetamol,10,100,69",
	})
	void shouldReturnFalseWhenPassedWrongId(int id, String name,
			double price, int qty, int fakeId) {
		inventoryManager.addNewMedecineToInventory(id, name, price, qty);
		assertFalse(inventoryManager.findMedecineByIdandUpdateQty(fakeId, 5));
		
	}
	
	@ParameterizedTest
	@CsvSource({
		"1,paracetamol,10,100",
	})
	void shouldReturnTrueWhenPassedCorrectIdForDeletion(int id, String name,
			double price, int qty) {
		inventoryManager.addNewMedecineToInventory(id, name, price, qty);
		assertTrue(inventoryManager.findMedecineByIdAndDelet(id));
	}
	
	@ParameterizedTest
	@CsvSource({
		"1,paracetamol,10,100,69",
	})
	void shouldReturnFalseWhenPassedCorrectIdForDeletion(int id, String name,
			double price, int qty,int fakeId) {
		inventoryManager.addNewMedecineToInventory(id, name, price, qty);
		assertTrue(inventoryManager.findMedecineByIdAndDelet(fakeId));
	}

}
