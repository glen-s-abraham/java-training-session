import java.io.IOException;

public class StandardStram {

	public static void main(String[] args) throws IOException {
		System.out.println("simple message");  
		System.err.println("error message");  
		int i=System.in.read();//returns ASCII code of 1st character  
		System.out.println((char)i);//will print the character  

	}

}
