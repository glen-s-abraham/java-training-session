class BaseModelPhone{
	private double price;
	private String color,version;
	public void setData(double price,String color, String version) {
		this.price=price;
		this.color = color;
		this.version = version;
	}
	public String getData() {
		return this.version+" "+this.color+" "+this.price;
	}
	public String sendSms() {
		return "SMS Sent";
	}
	public String call() {
		return "Call made";
	}
	public String watchVideo() {
		return "Watching video";
	}
	public String listenToMusic() {
		return "Listening to music";
	}
	public String picture() {
		return "Base model Picture";
	}
}

class AIPhone extends BaseModelPhone{
	public String callAIAssistant() {
		return "AI Assistant activated";
	}
	public String videoCall() {
		return "Video call activated";
	}
	//Method overriding
	public String picture() {
		return "AI Picture";
	}
}
public class SingleInheritenceEx1 {
	public static void main(String[] args) {
		AIPhone pixel = new AIPhone();
		pixel.setData(450, "black", "android 10");
		System.out.println(pixel.getData());
		System.out.println(pixel.call());
		System.out.println(pixel.listenToMusic());
		System.out.println(pixel.watchVideo());
		System.out.println(pixel.sendSms());
		System.out.println(pixel.callAIAssistant());
		System.out.println(pixel.videoCall());
		System.out.println(pixel.picture());
	}
}
