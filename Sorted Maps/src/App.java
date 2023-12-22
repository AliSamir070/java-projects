import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {
		HashMap<Integer , String>hashmap = new HashMap<Integer , String>();
		LinkedHashMap<Integer , String>linkedmap = new LinkedHashMap<Integer , String>();
		TreeMap<Integer , String> treemap = new TreeMap<Integer , String>();
		System.out.println("HashMap\n");
		Testmap(hashmap);
		System.out.println("\nLinkedMap\n");
		Testmap(linkedmap);
		System.out.println("\nTreeMap\n");
		Testmap(treemap);
	}
	public static void Testmap(Map<Integer , String>map) {
		map.put(9 , "Fox");
		map.put(6 , "Bear");
		map.put(1 , "Elephant");
		map.put(7 , "Wolf");
		map.put(0 , "Snake");
		map.put(8 , "Giraffe");
		for(Integer i :map.keySet() )
		{
			String value = map.get(i);
			System.out.println(i + ": " + value);
		}
	}
}
