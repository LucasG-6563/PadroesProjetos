package estrutural;

public class CoffeeShop {

	public static void main(String[] args) {
		CafePreto houseblend = new CafePreto();
		System.out.println(houseblend.getDescription() + ": " + houseblend.cost());

		Leite milkAddOn = new Leite(houseblend);
		System.out.println(milkAddOn.getDescription() + ": " + milkAddOn.cost());

		Sugar sugarAddOn = new Sugar(milkAddOn);
		System.out.println(sugarAddOn.getDescription() + ": " + sugarAddOn.cost());
		
		sugarAddOn = new Sugar(houseblend);
		System.out.println(sugarAddOn.getDescription()+ ": "+sugarAddOn.cost());
		
		Chocolate chocoAddOn = new Chocolate(houseblend);
		System.out.println(chocoAddOn.getDescription()+": "+chocoAddOn.cost());
		
		Canela canelaAddOn = new Canela(houseblend);
		System.out.println(canelaAddOn.getDescription()+": "+canelaAddOn.cost());
		
		canelaAddOn = new Canela(chocoAddOn);
		System.out.println(canelaAddOn.getDescription()+": "+canelaAddOn.cost());
		
		sugarAddOn = new Sugar(chocoAddOn);
		System.out.println(sugarAddOn.getDescription()+ ": "+sugarAddOn.cost());
	}

}
