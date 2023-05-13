package estrutural;

public class DirecaoHidraulica extends AddOn{

	public DirecaoHidraulica(Beverage bev) {
		super("Direção Hidraulica", bev);
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription()+ " com Direção Hidráulica";
	}
	
	@Override
	public double cost() {
		return beverage.cost() + 2500;
	}
}
