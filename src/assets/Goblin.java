package assets;

public class Goblin extends Actor {

    public Goblin() {
        // Goblin base constructor
//        System.out.println("New Goblin was created!!!");
        this.setName("Goblin");
        this.setAttack(10);
        this.setHealth(100);
        this.setArmorClass(0);
    }

    @Override
    public String toString() {
        return "\uD83D\uDC79";
    }
}
