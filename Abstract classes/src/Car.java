
public class Car extends Machine {

	@Override
	public void start() {
		System.out.println("Car started");
		
	}

	@Override
	public void doStuff() {
		System.out.println("Car do stuff...");
		
	}

	@Override
	public void shutdown() {
		System.out.println("shutdown Car...");
		
	}
	
	
	
}
