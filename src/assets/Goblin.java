package assets;

public class Goblin extends Actor {

    public Goblin() {
        this.setName("Goblin");
    }

    @Override
    public String toString() {
        return Character.toString(this.getName().charAt(0));
    }
}
