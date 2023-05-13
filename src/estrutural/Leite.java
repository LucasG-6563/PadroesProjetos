package estrutural;

public class Leite extends AddOn{
	public Leite(Beverage bev) {
		super("Milk", bev);
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " com Leite";
	}

	@Override  public double cost() {
		return beverage.cost() + 100;
	}

}
