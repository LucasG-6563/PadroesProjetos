package estrutural;

public class Carro extends Beverage {
	public Carro() {
		super("Carro");
	}

	@Override
	public double cost() {
		return 40000;
	}
}
