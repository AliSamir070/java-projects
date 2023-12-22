import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		//Hashset doesn't retain the order
			Set<String> set1 = new HashSet<String>();
			//LinkedHashSet remember the order of items you enterd
			Set<String> set2 = new LinkedHashSet<String>();
			//Set<String> set3 = new TreeSet<String>();
			set1.add("Dog");
			set1.add("Cat");
			set1.add("Mouse");
			set1.add("Bear");
			set1.add("Fox");
			System.out.println("HashSet");
			for(String element : set1) {
				System.out.println(element);
			}
			// Adding duplicate item does nothing
			
			set1.add("Mouse");
			System.out.println(set1);
			System.out.println("\nLinkedHashSet\n");
			set2.add("Dog");
			set2.add("Cat");
			set2.add("Mouse");
			set2.add("Bear");
			set2.add("Fox");
			for(String element : set2) {
				System.out.println(element);
			}
			System.out.println("\nTreeSet\n");
			set3.add("Dog");
			set3.add("Cat");
			set3.add("Mouse");
			set3.add("Bear");
			set3.add("Fox");
			for(String element : set3) {
				System.out.println(element);
			}
			
			/////Does contains element////
			if(set1.contains("aadvark")) {
				System.out.println("Contains aadvark");
			}
			if(set1.contains("Cat")) {
				System.out.println("Contains Cat");
			}
	}

}
