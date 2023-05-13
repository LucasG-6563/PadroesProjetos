package estrutural;

public class CarShop {

	public static void main(String[] args) {
		Carro carro = new Carro();
		System.out.println(carro.getDescription()+": R$"+ carro.cost());
		
		Ac acAddOn = new Ac(carro);
		System.out.println(acAddOn.getDescription()+": R$"+ acAddOn.cost());
		
		DirecaoHidraulica dhAddOn = new DirecaoHidraulica(carro);
		System.out.println(dhAddOn.getDescription()+": R$"+ dhAddOn.cost());
		
		dhAddOn = new DirecaoHidraulica(acAddOn);
		System.out.println(dhAddOn.getDescription()+": R$"+ dhAddOn.cost());
	}

}
