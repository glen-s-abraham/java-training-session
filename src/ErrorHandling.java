
public class ErrorHandling {

	public static void main(String[] args) {
		int a=4,b=0;
		try {
			int c= a/b;
		}catch(ArithmeticException err) {
			System.out.println(err.getMessage());
		}
	}
}
