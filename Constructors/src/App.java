class Machine{
	private String name;
	private int code;
	public Machine() {
		System.out.println("Constructor Running!");
		name = "Arnie";
	}
	public Machine(String name) {
		this.name = name;
	}
	public Machine(String name , int code)
	{
		this.name = name;
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public int getCode() {
		return code;
	}
}
public class App {

	public static void main(String[] args) {
		Machine machine1 = new Machine();
		System.out.println(machine1.getName());
		Machine machine2 = new Machine("7amada");
		System.out.println(machine2.getName());
		Machine machine3 = new Machine("Luca" , 1221);
		System.out.println(machine3.getName() + "," + machine3.getCode());


	}

}
