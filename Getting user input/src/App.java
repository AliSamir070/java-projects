import java.util.Scanner;

public class App {

	public static void main(String[] args) {
       /* Scanner input = new Scanner(System.in);

        System.out.println("Enter the float number");
       double Value= input.nextDouble();
       input.nextLine();
       String s = input.nextLine();

        System.out.println(s);*/
		String in = "ls > tt.txt";
		String filepath = in.substring(in.indexOf(">") + 2).trim();
		
		in = in.replace(filepath, "");
		in = in.replace(">", "");
		in = in.trim();
		in = in+"d";
		System.out.println(in);
		System.out.println(filepath);
      
	}

}
