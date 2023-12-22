
public class App {

	public static void main(String[] args) {
		App app = new App();
		//===================================================================
		int value = 7;
		System.out.println("1-The value is: " + value);
		app.show(value);
		System.out.println("4-The value is: " + value);
		//===================================================================
		System.out.println();
		
		Person person = new Person("Bob");
		System.out.println("1- person is: " + person);
		app.show(person);
		System.out.println("4- person is: " + person);
		
	}
	public void show(int value) {
		System.out.println("2-The value is: " + value);
		value = 8;
		System.out.println("3-The value is: " + value);
	}
	public void show(Person person) {
		System.out.println("2- person is: " + person);
		person.setName("Sue");
		person = new Person("Mike");
		System.out.println("3- person is: " + person);


	}

}
