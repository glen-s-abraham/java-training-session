
public class HeroHonda extends AbstractHonda implements InterfaceHero{

	public static void main(String[] args) {
		HeroHonda hero = new HeroHonda();
		System.out.println(hero.body("black"));
		System.out.println(hero.engine(150));

	}

	@Override
	public String body(String color) {
		return "Body color "+color;
	}

	@Override
	public String engine(int cc) {
		return "Engine cc "+cc;
	}

}
