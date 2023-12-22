class Frog{
	private String name;
	private int ID;
	public Frog(String name , int ID) {
		this.name = name;
		this.ID = ID;
	}
	public String toString() {
		/*StringBuilder sb = new StringBuilder();
		sb.append("Hello , Name is: ").append(name).append(" ,and ID is: ").append(ID);*/
		return String.format("Hello , Name is:%	2s ,and ID is:%-2d" , name , ID);
			
	}
}
public class App {

	public static void main(String[] args) {
		Frog frog1 = new Frog("Mizzo" , 12);
		Frog frog2 = new Frog("Roger" , 15);
		System.out.println(frog1);
		System.out.println(frog2);

	}

}
