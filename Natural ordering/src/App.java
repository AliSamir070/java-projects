import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
class Person implements Comparable<Person>{
	private String name;

	@Override
	public String toString() {
		return name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Person o) {
		int len1 = this.name.length();
		int len2 = o.name.length();
		if(len1 > len2) {
			return 1;
		}
		else if(len1 < len2) {
			return -1;
		}
		else {
			return this.name.compareTo(o.name);
		}
		 
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
public class App {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		Set<Person> set = new TreeSet<Person>();
		addElemnts(list);
		addElemnts(set);
		Collections.sort(list );
		showElements(list);
		System.out.println("\n");
		showElements(set);	
		
	}
	private static void addElemnts(Collection<Person> col) {
		col.add(new Person("Joe"));
		col.add(new Person("Sue"));
		col.add(new Person("Juliet"));
		col.add(new Person("Clare"));
		col.add(new Person("Mike"));

	}
	private static void showElements(Collection<Person>col) {
		for(Person element:col) {
			System.out.println(element);
		}
	}
}
