
public class App {

	public static void main(String[] args) {
		// Inefficient
		
		String info = " ";
		info+= "My name is:";
		info+= "Ahmed , ";
		// efficient
		
		StringBuilder string = new StringBuilder("");
		string.append("My name is Sue.");
		string.append(" ");
		string.append("I am a lion Tamer");
		System.out.println(string.toString());
		
		StringBuilder s = new StringBuilder();
		s.append("My name is Bob").append(" ").append("I am superHero");
		System.out.println(s.toString());
		
		/////////formatting
		
		System.out.println("Here is some text.\t here is tab. \n here is new line");
		System.out.println("More Text");
		//formatting integers
		System.out.printf("Total is %-4d , cost is %d" , 5 , 120);
		for(int i=0 ; i<20;i++) {
			System.out.printf("%-2d: %s\n" , i , "Some text here");
		}
		//formatting floats
		System.out.printf("The floating number is: %.1f" , 3.5);

	}

}
