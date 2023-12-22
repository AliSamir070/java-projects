import java.util.Scanner;

public class Do_While {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	/*System.out.println("Enter a number");
	int value = scanner.nextInt();
	while(value!=5)
		{
			System.out.println("Enter a number");
			value = scanner.nextInt();
		}
	System.out.println("OH , We got 5");*/
	int value;
	do {
		System.out.println("Enter a number");
		 value = scanner.nextInt();
	   }while(value!=5);
	System.out.println("OH , We got 5");
	}

}
