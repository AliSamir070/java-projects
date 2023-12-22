import world.Plant;
/*
 * private --- same class only
 * public --- anywhere
 * protected -- same class,child class and same package
 * no modifier --- same package only
 */
public class App {

	public static void main(String[] args) {
		Plant plant1 = new Plant();
	    System.out.println(plant1.name);
	    System.out.println(Plant.ID);
	    // size is protected  , App is not in same package of plant
	    System.out.println(plant1.size);
	    // App won't work , plant and app are not in same package
	    System.out.println(plant1.height);

	}

}
