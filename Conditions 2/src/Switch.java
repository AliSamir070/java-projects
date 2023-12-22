import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Please enter some text: ");
     String text = scanner.nextLine();
     switch(text)
     {
     case "start":
    	 System.out.println("Started");
    	 break;
     case "stop" :
    	 System.out.println("Stopped");
          break;
     default:
    	 System.out.println("None");
     }
	}

}
