import java.util.ArrayList;
import java.util.List;

public class ArrayListImpl {

	public static void main(String[] args) {
		List <Integer> integerList=new ArrayList<Integer>();
		integerList.add(10);
		integerList.add(20);
		integerList.add(30);
		integerList.add(10);
		System.out.println(integerList);
		System.out.println(integerList.contains(10));
		integerList.set(0, 25);
		System.out.println(integerList.get(0));
		integerList.remove(Integer.valueOf(10));
		System.out.println(integerList.contains(10));
		integerList.clear();
		System.out.println(integerList);

	}

}
