class Frog{
	private String name;
	private int age;
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public void setInfo(String name , int age ) {
		setAge(age);
		setName(name);
	}
}
public class App {
	public static void main(String[] args) {
		Frog frog1 = new Frog();
		frog1.setAge(12);
		frog1.setName("Mizo");
		System.out.println("Frog name is: " + frog1.getName() + " ,and its age is: " + frog1.getAge());
	}
}
