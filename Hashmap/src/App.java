import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		HashMap<Integer , String> map = new HashMap<Integer , String>();
		map.put(5 , "Five");
		map.put(6 , "Six");
		map.put(7 , "Seven");
		map.put(8 , "Eight");
		map.put(3 , "Three");
		map.put(4 , "Four");
		String Text = map.get(4);
		System.out.println(Text);
		for(Map.Entry<Integer, String> entry:map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ": " + value);
		}
	}

}
