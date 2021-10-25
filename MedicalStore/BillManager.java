import java.util.ArrayList;
import java.util.List;

public class BillManager{
	private List <Bill> billItems = new ArrayList<Bill>();
	private InventoryManager inventory;
	public BillManager() {
		this.inventory = new InventoryManager();
	}
	public BillManager(InventoryManager inventory) {
		this.inventory =inventory;
	}
	//Accepts id,qty to add medecine to bill
	public boolean addMedecineToBill(int id,int qty) {
		try {
			
			inventory.findMedecineByIdandUpdateQty(id,
					inventory.getMedecineById(id).getMedecineStockQty()-qty
			);
			
			billItems.add(new Bill(inventory.getMedecineById(id),qty));
			
			return true;
		}catch(Exception exception) {
			return false;
		}
	}
	
	//Print Bill
	public List <Bill> printBill(){
		return this.billItems;
	}
	
	//deletes all elements in the list
	public void resetBillList() {
		this.billItems.clear();
	}
	
	
}
