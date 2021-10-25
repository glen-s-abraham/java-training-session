
public class Medecine {
	private int medecineId;
	public String medecineName;
	private double medecinePrice;
	private int medecineStockQty;
	
	public Medecine() {
		
	}
	
	public Medecine(int medecineId, String medecineName, double medecinePrice, int medecineStockQty) {
		super();
		this.medecineId = medecineId;
		this.medecineName = medecineName;
		this.medecinePrice = medecinePrice;
		this.medecineStockQty = medecineStockQty;
	}
	public int getMedecineId() {
		return medecineId;
	}
	public void setMedecineId(int medecineId) {
		this.medecineId = medecineId;
	}
	public String getMedecineName() {
		return medecineName;
	}
	public void setMedecineName(String medecineName) {
		this.medecineName = medecineName;
	}
	public double getMedecinePrice() {
		return medecinePrice;
	}
	public void setMedecinePrice(double medecinePrice) {
		this.medecinePrice = medecinePrice;
	}
	public int getMedecineStockQty() {
		return medecineStockQty;
	}
	public void setMedecineStockQty(int medecineStockQty) {
		this.medecineStockQty = medecineStockQty;
	}
	
}
