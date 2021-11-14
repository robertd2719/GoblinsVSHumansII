package assets;

public class Human extends Actor {

    public Human() {
        System.out.println("New Human Created");
        this.setName("Human");
        this.setAttack(10);  // base attack
        this.setHealth(100); // base health
    }
    @Override
    public String toString() {
        return "\uD83D\uDC73";
    }
}
