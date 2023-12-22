import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {

	public static void main(String[] args) {
		System.out.println("Writing objects...");
		Person mike = new Person(543 , "Mike");
		Person Sue = new Person(221 , "Sue");
		System.out.println(mike);
		System.out.println(Sue);
		try(FileOutputStream f = new FileOutputStream("people.bin")){
			ObjectOutputStream os = new ObjectOutputStream(f);
			os.writeObject(mike);
			os.writeObject(Sue);
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
