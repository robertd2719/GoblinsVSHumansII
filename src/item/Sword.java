package item;

public class Sword extends Item{
    String Name;
    Direction d;
    Effect e;

    public Sword(){
        this.setName("Sword");
        this.setDirection(Direction.INCREASE);
        this.setEffect(Effect.ATTACK);
        this.setValue(10);
    }
}
