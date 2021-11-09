package assets;

import item.Item;

import java.util.ArrayList;

public abstract class Actor extends Asset {
    private String name;
    private int health;
    private int attack;
    private int armorClass;
    private ArrayList<Item> itemList;

    // @TODO IMPLEMENT LOGIC FOR ITEM USAGE
    public void useItem(Item item) {
        System.out.println(this.name + " uses " + item.getName());
        switch (item.getEffect()) {
            case LIFE: {
                switch (item.getDirection()) {
                    case INCREASE:
                        this.setHealth(this.getHealth() + item.getValue());
                    case DECREASE:
                        this.setHealth(this.getHealth() - item.getValue());
                }
            }
            case ATTACK:{
                switch(item.getDirection()){
                    case INCREASE:
                        this.setAttack(this.getAttack() + item.getValue());
                    case DECREASE:
                        this.setAttack(this.getAttack() + item.getValue());
                }
            }
            case ARMOR:{
                switch (item.getDirection()){
                    case INCREASE:
                        this.setArmorClass(this.getArmorClass() + item.getValue());
                    case DECREASE:
                        this.setArmorClass(this.getArmorClass() - item.getValue());
                }
            }
        }
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
}
