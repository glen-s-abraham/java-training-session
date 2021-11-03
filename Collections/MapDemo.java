import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String args[]) {
		Map <Integer,String> nameList = new TreeMap<>();
		nameList.put(1, "aaron");
		nameList.put(3, "shaaron");
		nameList.put(2, "stone");
//		System.out.println(nameList);
		System.out.println(nameList);
		for(Map.Entry<Integer,String> name:nameList.entrySet())
			System.out.println(name.getKey() + " " +name.getValue());
	}
}
