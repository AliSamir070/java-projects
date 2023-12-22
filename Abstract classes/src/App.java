
public class App {

	public static void main(String[] args) {
		Camera cam1 = new Camera();
		Car car1 = new Car();
		cam1.setID(5);;
		car1.setID(3);
		// wrong : Machine mach1 = new Machine();
		cam1.start();
		car1.start();
	}

}
