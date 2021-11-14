package assets;

public class Castle extends NonActor {
    public Castle() {
        System.out.println("New Castle Created");
        this.setName("Castle");
    }
    @Override
    public String toString() {
        return "\uD83C\uDFF0";
    }
}
