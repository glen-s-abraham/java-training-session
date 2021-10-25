
public class Bill {
	private Medecine medecine;
	private int purchaseQty;
	private double itemTotalPrice;
	public Bill() {
		this.purchaseQty = -1;
	}
	public Bill(Medecine medecine, int purchaseQty) {
		super();
		this.medecine = medecine;
		this.purchaseQty = purchaseQty;
		this.itemTotalPrice = medecine.getMedecinePrice()*purchaseQty;
		
	}
	public Medecine getMedecine() {
		return medecine;
	}
	public void setMedecine(Medecine medecine) {
		this.medecine = medecine;
	}
	public int getPurchaseQty() {
		return purchaseQty;
	}
	public void setPurchaseQty(int purchaseQty) {
		this.purchaseQty = purchaseQty;
	}
	public double getTotalBillAmount() {
		return itemTotalPrice;
	}
	public void setTotalBillAmount() {
		if(this.medecine == null || this.purchaseQty ==-1)
			throw new RuntimeException("Medecine not set");
		this.itemTotalPrice = medecine.getMedecinePrice()*purchaseQty;
	}
	
}
