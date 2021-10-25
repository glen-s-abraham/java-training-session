import java.util.ArrayList;
import java.util.List;

public class BillManager{
	private List <Bill> billItems = new ArrayList<Bill>();
	
	
	//Accepts id,qty to add medecine to bill
	public boolean addMedecineToBill(Medecine medecine,int qty) {	
			if(qty<=0) throw new IllegalArgumentException("ivalid property value");
			billItems.add(new Bill(medecine,qty));
			return true;
	}
	
	public boolean deleteMedecineFromBill(int id) {
		for(Bill bill:billItems)
			if(bill.getMedecine().getMedecineId()==id) {
				billItems.remove(bill);
				return true;
			}
		return false;
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
