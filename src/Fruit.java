
public class Fruit {
	String name,color;
	double price;
	
	public void setFruitData(String name,String color,double price) {
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	public void getFruitData() {
		System.out.println(name+" "+color+" "+price);
	}
}
