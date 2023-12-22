
public class Car extends Machine {
   
	@Override
	public void Start() {
		// TODO Auto-generated method stub
    	System.out.println("car started");
	}

	public void wipeWindShield() {
	 System.out.println("Wiping Windshield");	
	}
    public void show() {
    	System.out.println("Car name: " + name);
    }
}
