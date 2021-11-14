package item;

public class Chainmail extends Item{
    private String name;
    private Direction d;
    private Effect e;

    public Chainmail(){
        this.setName("Chainmail");
        this.setDirection(Direction.INCREASE);
        this.setEffect(Effect.ARMOR);
        this.setValue(15);
    }
}
