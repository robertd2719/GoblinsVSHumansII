package item;


public class HealthPotion extends Item{
    private String name;
    private Direction d;
    private Effect e;
    private int value;

    public HealthPotion(){
        this.setName("Health Potion");
        this.setDirection(Direction.INCREASE);  // INCREASE DIRECTION
        this.setEffect(Effect.LIFE);
        this.setValue(20);
    }
}
