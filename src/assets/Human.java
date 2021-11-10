package assets;

public class Human extends Actor {

    public Human() {
        this.setName("Human");
        System.out.println("New Human Created");
    }
    @Override
    public String toString() {
        return Character.toString(this.getName().charAt(0));
    }
}
