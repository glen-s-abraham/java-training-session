import java.util.*;

public class CapitalizeString {
	public static String capitalize(String str) {
		String capitalizedStr = "";
		for(String word:str.split(" ")) {
			word = word.replaceFirst(
					word.substring(0, 1),
					word.substring(0, 1).toUpperCase()
			);
			capitalizedStr+= word + " ";
		}
		return capitalizedStr;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = scanner.nextLine();
		System.out.println(capitalize(str));
	}
}
