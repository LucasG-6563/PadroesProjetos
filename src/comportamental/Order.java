package comportamental;

public class Order implements Command{

	private Chef chef;
	private String food;

	public Order(Chef chef, String food) {
		this.chef = chef;
		this.food = food;
	}

	@Override
	public void execute() {
		if (this.food.equals("Massa")) {
			this.chef.cookPasta();
		} else if (this.food.equals("Bolo")) {
			this.chef.bakeCake();
		} else if (this.food.equals("Salada")) {
			this.chef.salada();
		} else if (this.food.equals("Macarrão")) {
			this.chef.macarrao();
		} else {
			this.chef.parfait();
		}
	}
}
