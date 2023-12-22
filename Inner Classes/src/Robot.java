public class Robot {
	private int id ;
	private class Brain{
		public void think() {
		System.out.println("Robot " + id + " is thinking");	
		}
	}
	static class Battery{
		public void charge() {
			System.out.println("Battery charged...");
		}
	}
	public Robot(int id) {
		this.id = id;
	}
	public void start() {
		System.out.println("Robot started " + id);
		Brain Br1 = new Brain();
		Br1.think();
		String name = "Robot";
		class Temp{
			public void doSomething() {
				System.out.println("ID is: " + id);
				System.out.println("My name is " + name);
			}
		}
		Temp tem = new Temp();
		tem.doSomething();
	}
}
