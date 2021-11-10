package assets;

public class Goblin extends Actor {

    public Goblin() {
        System.out.println("New Goblin was created!!!");
        this.setName("Goblin");
        this.setAttack(5);
        this.setHealth(100);
    }

    @Override
    public String toString() {
        return Character.toString(this.getName().charAt(0));
    }
}
