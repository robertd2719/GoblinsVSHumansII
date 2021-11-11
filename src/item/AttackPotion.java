package item;

public class AttackPotion extends Item{
    public AttackPotion(){
        this.setDirection(Direction.INCREASE);  // Increase
        this.setEffect(Effect.LIFE);            // affect effects is life
        this.setValue(5);                       // base attack potions only add(5).
    }
}
