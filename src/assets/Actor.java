package assets;

import item.Item;
import java.util.ArrayList;

public abstract class Actor extends Asset {
    String name;
    int health;
    int attack;
    int armorClass;
    ArrayList<Item> itemList;

    // @TODO IMPLEMENT LOGIC FOR ITEM USAGE
    public void useItem(Item item){
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
