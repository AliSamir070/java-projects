
public enum Animal {
	Cat("Tom") , Dog("Fox") , Mouse("Jerry") , Bird("Mizo");
	private String name;
	Animal(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return "This animal is called: " + name;
 	}
}
