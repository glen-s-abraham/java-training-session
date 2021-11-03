import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {
	public static void main(String args[]) {
		//Set <Integer> integerSet = new HashSet<Integer>();
		//Set <Integer> integerSet = new TreeSet<Integer>();
		Set <Integer> integerSet = new LinkedHashSet<Integer>();
		integerSet.add(50);
		integerSet.add(20);
		integerSet.add(30);
		integerSet.add(10);
		integerSet.add(40);
		System.out.println(integerSet);
		
	}
}
