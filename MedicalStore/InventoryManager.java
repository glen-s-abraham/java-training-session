import java.util.List;


public class InventoryManager {
	protected  Inventory inventory;
	public InventoryManager() {
		this.inventory = new Inventory();
	}
	public InventoryManager(Inventory inventory) {
		this.inventory = inventory;
	}
	
	//Accepts necessary parameters and create a medecine object and returns it
	public Medecine createNewMedecine(int id,String name,double price, int qty) {
		return new Medecine(id,name,price,qty);
	}
	
	//Create a new inventory entry
	public boolean addNewMedecineToInventory(int id,String name,double price, int qty) {
		try {
			inventory.setMedecines(createNewMedecine(id,name,price,qty));
			return true;
		}catch(Exception ecxeption) {
			return false;
		}
		
	}
	
	//Accepts id and qty as parameters to update medecine stock
	public boolean findMedecineByIdandUpdateQty(int id, int qty) {
		if(qty<0) throw new IllegalArgumentException("Qty should be greater then 0");
		try {
			inventory.getMedecineById(id).setMedecineStockQty(qty);
			return true;
		}catch(Exception exception) {
			return false;
		}
	}
	
	//Accepts id as parameters and deletes medecine from inventory
	public boolean findMedecineByIdAndDelet(int id) {
		try {
			Medecine medecine=inventory.getMedecineById(id);
			inventory.deleteMedecine(medecine);
			return true;
		}catch(Exception exception) {
			return false;
		}
	}
	
	//Returns the list of all medecines in inventory
	public List<Medecine> getMedecines() {
		return inventory.getMedecines();
	}
	
	//Returns the medecine by given id if exists
	public Medecine getMedecineById(int id) {
	   Medecine medecine=inventory.getMedecineById(id);
	   if(medecine!=null) return medecine;
	   return null;	   
   }
}
