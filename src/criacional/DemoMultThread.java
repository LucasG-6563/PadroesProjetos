package criacional;

public class DemoMultThread {

	public static void main(String[] args) {
		Thread threadFoo = new Thread(new ThreadFoo());
		Thread threadBar = new Thread(new ThreadBar());
		
		threadFoo.start();
		threadBar.start();

	}
	
	static class ThreadFoo implements Runnable {
		@Override
		public void run() {
			Singleton singleton = Singleton.getInstance("Opa");
			System.out.println(singleton.value);
		}
	}
	static class ThreadBar implements Runnable {
		@Override
		public void run() {
			Singleton singleton = Singleton.getInstance("BAR");
			System.out.println(singleton.value);
		}
	}

}
