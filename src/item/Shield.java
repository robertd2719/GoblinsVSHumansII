package item;

public class Shield extends Item{
    public Shield(){
        this.setName("Shield");
        this.setDirection(Direction.INCREASE);
        this.setEffect(Effect.ARMOR);
        this.setValue(2);     // keep armor classes small
    }
}
