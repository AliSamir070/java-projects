
public class App {

	public static void main(String[] args) {
		Machine machine1 = new Machine();
		machine1.Start();
		machine1.Stop();
		Car car1 = new Car();
		car1.Start();
		car1.wipeWindShield();
		car1.show();
		car1.Stop();

	}

}
