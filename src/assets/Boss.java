package assets;

public class Boss extends Actor {
    public Boss() {
        // Goblin base constructor
        System.out.println("New Boss was created!!!");
        this.setName("Boss");
        this.setAttack(25);
        this.setHealth(100);
    }

    @Override
    public String toString() {
        return "\uD83D\uDC7A";
    }
}
