class Person{
	String name;
	int age;
	
	void speak() {
		System.out.println("My name is " + name + " and i'm " + age + " years old");
	}
	int calculateRetirementYears() {
		int YearsLeft = 65 - age;
        return YearsLeft;	
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
}
public class App {

	public static void main(String[] args) {
     Person person1 = new Person();
     person1.name = "Joe";
     person1.age = 22;
     person1.speak();
     int years = person1.calculateRetirementYears();
     System.out.println(years);
     int age  = person1.getAge();
     String name = person1.getName();
     System.out.println("Name is: " + name + " age is: " + age);
	}

}
