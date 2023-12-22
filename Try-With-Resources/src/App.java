import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Temp implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("Closing..");
	}
	
}
public class App {

	public static void main(String[] args) {
	/*	try(Temp temp = new Temp()){
			
		}catch(Exception e) { 
			e.printStackTrace();
		}*/
		Scanner sc = new Scanner(System.in);
	       int NumberOfTests = sc.nextInt();
	       sc.next();
	       for(int k =0;k<NumberOfTests;k++){
	       String S = sc.nextLine();
	       StringBuilder even = new StringBuilder();
	       StringBuilder odd = new StringBuilder();
	       char[] arr = S.toCharArray();
	       for(int i =0;i<S.length();i++){
	           if(i%2==0){
	               even.append(arr[i]);
	                    }
	           else{
	               odd.append(S[i]);
	                }
	            }
	        System.out.println(even.toString() + " " + odd.toString());
	        }
	       Map<String,Integer> myMap = new HashMap<String,Integer>();
	}

}
