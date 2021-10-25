import java.util.ArrayList;
import java.util.List;

public class Inventory {
	private List <Medecine>medecines = new ArrayList<Medecine>();
	
	

	public List<Medecine> getMedecines() {
		return medecines;
	}
	
	public Medecine getMedecineById(int id) {
		for(Medecine medecine:medecines) {
			if(medecine.getMedecineId()==id)
				return medecine;
		}
		return null;
	}

	public void setMedecines(Medecine medecine) {
		medecines.add(medecine);
	}
	
	public boolean deleteMedecine(Medecine medecine) {
		try {
			medecines.remove(medecine);
			return true;
		}
		catch(Exception exception) {
			return false;
		}
	}
	
}
