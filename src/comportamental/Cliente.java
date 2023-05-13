package comportamental;

public class Cliente {
	public static void main(String[] args) {
		Chef chef = new Chef();
        
		Order order = new Order(chef, "Massa");
		Waiter waiter = new Waiter(order);
		waiter.execute();

		order = new Order(chef, "Macarrão");
		waiter = new Waiter(order);
		waiter.execute();
		
		order = new Order(chef, "Salada");
		waiter = new Waiter(order);
		waiter.execute();
		
		order = new Order(chef, "Bolo");
		waiter = new Waiter(order);
		waiter.execute();
		
		order = new Order(chef, "Parfait");
		waiter = new Waiter(order);
		waiter.execute();
	}

}
