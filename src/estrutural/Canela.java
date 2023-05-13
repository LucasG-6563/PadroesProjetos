package estrutural;

public class Canela extends AddOn{
	public Canela(Beverage bev) {
		super("Canela", bev);
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " com Canela";
	}

	@Override  public double cost() {
		return beverage.cost() + 100;
	}
}
