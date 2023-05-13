package estrutural;


public class CafePreto extends Beverage{

	public CafePreto() {
		super("Café preto");
	}

	@Override
	public double cost() {
		return 250;
	}

}
