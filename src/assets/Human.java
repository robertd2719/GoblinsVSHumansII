package assets;

public class Human extends Actor {

    public Human() {
//        System.out.println("New Human Created");
        this.setName("Human");
        this.setAttack(10);  // base attack
        this.setHealth(100); // base health
        this.setArmorClass(0);
    }
    @Override
    public String toString() {
        return Character.toString(this.getName().charAt(0));
    }
}
