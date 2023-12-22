import java.util.ArrayList;
import java.util.HashMap;
class Animal{
	
}
class Machine{

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "I'am Machine";
	}
	public void start() {
		System.out.println("Machine started");
	}
	
}
class Camera extends Machine{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "I'am a Camera";
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Camera started");
	}
	
}
public class App {

	public static void main(String[] args) {
		// Before Java 5
		/*ArrayList list = new ArrayList();
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		String fruit = (String)list.get(1);
		System.out.println(fruit);
		
		//Modern
		ArrayList<String>strings = new ArrayList<String>();
		strings.add("Cat");
		strings.add("Dog");
		strings.add("alligator");
		String Animal = strings.get(1);
		System.out.println(Animal);
		///// There can be more than one argument with different type
		HashMap<Integer , String> map = new HashMap<Integer , String>();
		//// Java 7 style
		ArrayList<Animal> somelist = new ArrayList<>();*/
		/// Genrics and wildcards
		
		ArrayList<Machine> list1 = new ArrayList<>();
		list1.add(new Machine());
		list1.add(new Machine());
		showInfo(list1);
		ArrayList<Camera> list2 = new ArrayList<>();
		list2.add(new Camera());
		list2.add(new Camera());
		showInfo(list2);
		showList(list2);
	}
	public static void showInfo(ArrayList<? extends Machine>list) {
		for(Machine value:list) {
			System.out.println(value);
			value.start();
		}
	}
	public static void showList(ArrayList<? super Camera>list) {
		for(Object value:list) {
			System.out.println(value);
			
		}
	}


}
