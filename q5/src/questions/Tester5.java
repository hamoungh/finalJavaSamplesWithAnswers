package questions;
/* define the classes and methods that are
 * neccessary to compile the tester code.
 * you need to define an arraylist inside the
 * Player class that stores
 * his pickUps */ 
public class Tester5 {

	public static void main(String[] args) {
        PickUp weapon = new PickUp("weapon");
        PickUp health = new PickUp("health");
        PickUp bomb = new PickUp("bomb");

        Player p = new Player();
        p.pickups.add(weapon);
        p.pickups.add(health);

	}

}
