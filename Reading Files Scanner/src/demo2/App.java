package demo2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		//String FileName = "C:/Users/User/Desktop/FilesJava.txt";
		String FileName = "FilesJava.txt";
		File file = new File(FileName);
		Scanner in = new Scanner(file);
		int value = in.nextInt();
		in.nextLine();
		System.out.println("Read value: "+value);
		int count = 2;
		while(in.hasNextLine()) {
			String line = in.nextLine();
			System.out.println(count + ":" + line);
			count++;
		}
		in.close();
	}

}
