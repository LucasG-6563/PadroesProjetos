package estrutural;

public class Chocolate extends AddOn{
	public Chocolate(Beverage bev) {
		super("Chocolate", bev);
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " com Chocolate";
	}

	@Override  public double cost() {
		return beverage.cost() + 100;
	}
}
