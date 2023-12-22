import java.util.Iterator;
import java.util.LinkedList;

public class App {

	public static void main(String[] args) {
		LinkedList<String> animals = new LinkedList<String>();
		animals.add("Fox");
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Rabbit");
		// we use iterator if we want to remove an item through iterating
		// there is a listiterator which is used to add item through iterating
		Iterator<String>it = animals.iterator();
		while(it.hasNext()) {
		String value = it.next();
		System.out.println(value);
		if(value.equals("Cat")) {
			it.remove();
		}
		}
		System.out.println("\n");
		
		
		////Modern iteration , Java 5 and later
		for(String animal:animals) {
			System.out.println(animal);
		}

	}

}
