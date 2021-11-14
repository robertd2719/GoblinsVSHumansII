package assets;

public class Water extends NonActor {
    public Water() {
        System.out.println("New Water Created");
        this.setName("Water");
    }
    @Override
    public String toString() {
        return "\uD83C\uDF0A";
    }
}
