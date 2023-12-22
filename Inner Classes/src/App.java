
public class App {

	public static void main(String[] args) {
		Robot rob1 = new Robot(7);
		rob1.start();
		//Robot.Brain br = rob1.new Brain();
		//br.think();
		Robot.Battery bat = new Robot.Battery();
		bat.charge();
	}

}
