package item;

public class Cape extends Item{
    private String name;
    private Direction d;
    private Effect e;
    private int value;

    public Cape(){
        this.setName("Cape");
        this.setDirection(Direction.INCREASE);
        this.setEffect(Effect.ARMOR);
        this.setValue(2);
    }
}
