package assets;
import item.Item;

import java.util.ArrayList;
import java.util.Random;

public abstract class Actor extends Asset {
    private String name;
    private int health;
    private int attack;
    private int armorClass;
    private int rowPosition;
    private int columnPosition;
    private ArrayList<Item> itemList;

    // use this
    public void useItem(Item item) {
        System.out.println(this.name + " uses " + item.getName());
        switch (item.getEffect()) {
            case LIFE: {
                switch (item.getDirection()) {
                    case INCREASE: {
                        this.setHealth(this.getHealth() + item.getValue());
                        break;
                    }

                    case DECREASE:
                        this.setHealth(this.getHealth() - item.getValue());
                        break;
                }
            }
            break;
            case ATTACK:{
                switch(item.getDirection()){
                    case INCREASE:
                        this.setAttack(this.getAttack() + item.getValue());
                        break;
                    case DECREASE:
                        this.setAttack(this.getAttack() + item.getValue());
                        break;
                }
            }
            break;
            case ARMOR:{
                switch (item.getDirection()){
                    case INCREASE:
                        this.setArmorClass(this.getArmorClass() + item.getValue());
                    case DECREASE:
                        this.setArmorClass(this.getArmorClass() - item.getValue());
                }
            }
            break;
        }
    }

    // use this to inform the Actor where it is currently in the world
    public void setPosition(int row,int column) {
        this.setRowPosition(row);
        this.setColumnPosition(column);
    }

    public void attack(Actor actor){
        int attack = new Random().nextInt(10) + 1;
        System.out.println(actor.getName()+" attacks for: "+attack);
        actor.setHealth(actor.getHealth() - attack);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public int getRowPosition() {
        return rowPosition;
    }

    public void setRowPosition(int rowPosition) {
        this.rowPosition = rowPosition;
    }

    public int getColumnPosition() {
        return columnPosition;
    }

    public void setColumnPosition(int columnPosition) {
        this.columnPosition = columnPosition;
    }
}
