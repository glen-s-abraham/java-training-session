import java.util.ArrayList;
import java.util.List;

public class ArrayListImpl {

	public static void main(String[] args) {
		List <Integer> integerList=new ArrayList<Integer>();
		integerList.add(10);
		integerList.add(20);
		integerList.add(30);
		integerList.add(10);
		for(Integer number:integerList)
			System.out.println(number);

	}

}
