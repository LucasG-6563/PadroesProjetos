package estrutural;

public class Caramelo extends Beverage {
	public Caramelo() {
		super("Dark Roast");
	}

	@Override
	public double cost() {
		return 300;
	}

}
