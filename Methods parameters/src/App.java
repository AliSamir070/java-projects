class Robot{
	public void speak(String name) {
		System.out.println(name);
	}
	public void jump(int height) {
		System.out.println("Jumping: " + height + " meter");
	}
	public void moving(int distance , String direction) {
		System.out.println("Moving " + distance + " meters distance in direction " + direction);
	}
}
public class App {

	public static void main(String[] args) {
		Robot sam = new Robot();
		sam.speak("Hi i'm Sam");
		sam.jump(3);
		sam.moving(1000, "NorthWest");
	}

}
