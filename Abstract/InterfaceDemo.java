interface Printable{
	public void print();
}
interface Showable{
	public void print();
}
public class InterfaceDemo implements Printable,Showable{
	
	public static void main(String args[]) {
		InterfaceDemo obj = new InterfaceDemo();
		obj.print();
	}

	@Override
	public void print() {
		System.out.println("Hello");
		
	}

}
