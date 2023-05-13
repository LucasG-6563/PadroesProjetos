package estrutural;

public class Aveia extends AddOn{
	public Aveia(Beverage bev) {
		super("Aveia", bev);
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " com Aveia";
	}

	@Override  public double cost() {
		return beverage.cost() + 100;
	}
}
