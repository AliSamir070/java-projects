
public class App {

	public static void main(String[] args) {
		Animal animal = Animal.Cat;
		switch(animal) {
		case Bird:
			System.out.println("Bird");
			break;
		case Cat:
			System.out.println("Cat");
			break;
		case Dog:
			System.out.println("Dog");
			break;
		case Mouse:
			System.out.println("Mouse");
			break;
		default:
			break;
		
		}
		System.out.println(Animal.Dog);
		System.out.println("Enum name as string: " + Animal.Dog.name());
		System.out.println(Animal.Dog.getClass());
		System.out.println(Animal.Dog instanceof Animal);
		System.out.println(animal.getName());
		Animal animal2 = Animal.valueOf("Cat");
		System.out.println(animal2);
	}

}
