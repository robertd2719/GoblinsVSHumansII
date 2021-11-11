package item;

public class HealthPotion extends Item{
    public HealthPotion(){
        this.setDirection(Direction.INCREASE);  // INCREASE DIRECTION
        this.setEffect(Effect.LIFE);
        this.setValue(20);
    }
}
