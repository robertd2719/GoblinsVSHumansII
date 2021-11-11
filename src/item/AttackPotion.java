package item;

public class AttackPotion extends Item{
    private String name;
    private Direction direction;
    private Effect effect;
    private int value;

    public AttackPotion(){
        this.setName("Attack Potion");
        this.setDirection(Direction.INCREASE);  // Increase
        this.setEffect(Effect.ATTACK);            // affect effects is life
        this.setValue(5);                       // base attack potions only add(5).
    }
}
