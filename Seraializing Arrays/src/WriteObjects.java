import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {

	public static void main(String[] args) {
		System.out.println("Writing objects...");
		Person[] people = {new Person(543 , "Mike") , new Person(667 , "Sue") , new Person(122 , "Bob")} ;
		ArrayList<Person> peoplelist = new ArrayList<Person>(Arrays.asList(people)); 
		
		try(FileOutputStream f = new FileOutputStream("people.bin")){
			ObjectOutputStream os = new ObjectOutputStream(f);
			os.writeObject(people);
			os.writeObject(peoplelist);
			os.writeInt(peoplelist.size());
			for(Person person:peoplelist) {
				os.writeObject(person);
			}
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
