package estrutural;

public class Ac extends AddOn {

	public Ac(Beverage bev) {
		super("Ac", bev);
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription()+ " com AC";
	}
	
	@Override
	public double cost() {
		return beverage.cost() + 1000;
	}
}
