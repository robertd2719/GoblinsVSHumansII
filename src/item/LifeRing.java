package item;

public class LifeRing extends Item {
    public LifeRing(){
        this.setName("LifeRing");
        this.setDirection(Direction.INCREASE);
        this.setEffect(Effect.LIFE);
        this.setValue(10);
    }
}
