
public class Machine implements Info {
	private int ID;
	public void start() {
		System.out.println("Machine started");
	}
	@Override
	public void showInfo() {
		System.out.println("Machine ID is: " + ID);
		
	}
}
