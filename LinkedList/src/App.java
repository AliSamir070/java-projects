import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		/*
		 * Arraylist manges array internally
		 * [0][1][2][3][4][5][6]
		 */
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		/*
		 * Linkedlist consists of elements where each element has reference of previous and next element
		 * [0]->[1]->[2]..
		 *    <-   <-
		 */
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		doTimings("ArrayList" , arraylist);
		doTimings("LinkedList" , linkedlist);
		
	}
	private static void doTimings(String type , List<Integer>list) {
		for(int i =0 ; i<1E5 ; i++) {
			list.add(i);
		}
		long start = System.currentTimeMillis();
		// Add items in the end
		
		/*for(int i =0 ; i<1E5 ; i++) {
			list.add(i);
		}*/
		
		//Add items elsewhere
		for(int i =0 ; i<1E5 ; i++) {
			list.add(list.size() - 100 , i);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken is: " + (end - start) + "ms for type " + type);
	}
}
