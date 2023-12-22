class Thing{
	public String name;
	public static String description;
	public static final int LUCKY_NUMBER = 11;
	public static int count = 0;
	public Thing() {
		count++;
	}
	public void showName() {
		System.out.println(name);
	}
	public static void showInfo() {
		System.out.println(description);
	}
}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thing.description = "It is beautiful";
       Thing thing1 = new Thing();
       Thing thing2 = new Thing();
       System.out.println(thing2.count);
       thing1.name = "Bob";
       thing2.name = "Job";
       thing1.showName();
       thing2.showName();
       Thing.showInfo();
       System.out.println(Thing.description);
       thing1.description = "lol";
       System.out.println(Thing.description);
       System.out.println(Thing.LUCKY_NUMBER);
	}

}
