package item;

public abstract class Item {
    protected String name;    // The actual name of the item.
    private Effect effect;    // type of effect (Life,Attack,Armor)
    private Direction direction;  // increase or decrease of item.
    private int value = 0;       // Default value is (0)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Effect getEffect() {
        return effect;
    }

    public void setEffect(Effect effect) {
        this.effect = effect;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

