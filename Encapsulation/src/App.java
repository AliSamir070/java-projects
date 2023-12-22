class plant{
	private String name;
	public static final int ID = 7;
	public String getData() {
		String Data = "some stuff" + calculateGrowth();
		return Data;
	}
	private int calculateGrowth() {
		return 9;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
