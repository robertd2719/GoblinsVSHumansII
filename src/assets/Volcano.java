package assets;

public class Volcano extends NonActor{
    public Volcano() {
        System.out.println("New Volcano Created");
        this.setName("Volcano");
    }
    @Override
    public String toString() {
        return "\uD83C\uDF0B";
    }
}
