
public class MedicalStore {
	private InventoryManager inventoryManager;
	private BillManager billManager;
	
	public MedicalStore() {
		this.billManager=new BillManager();
		this.inventoryManager = new InventoryManager();
	}
	//For testing
	public MedicalStore(InventoryManager imanager) {
		this.billManager=new BillManager();
		this.inventoryManager = imanager;
	}
	
	public boolean addMedecineToBillAndUpdateQty(int medecineId,int billQty) {
		try {
			Medecine medecine = inventoryManager.getMedecineById(medecineId);
			inventoryManager.findMedecineByIdandUpdateQty(medecineId, 
					medecine.getMedecineStockQty()-billQty);
			return billManager.addMedecineToBill(medecine, billQty);
		}catch (Exception e) {
			return false;
		}
	}
	
}
