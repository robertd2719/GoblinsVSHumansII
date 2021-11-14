package assets;

public class Tile extends NonActor {
    public Tile(){
    System.out.println("New Tile Created");
    this.setName("Tile");
}
    @Override
    public String toString() {
        return "\uD83C\uDF2B";
    }
}
