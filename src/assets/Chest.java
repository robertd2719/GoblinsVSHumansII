package assets;

import item.Item;
import item.RandomItem;

import java.util.ArrayList;

public class Chest extends NonActor{
    int row,column;
    String name;
    ArrayList<Item> ChestInventory = new ArrayList<>();

    public Chest() {
        // When a new chest is created populate it with random items.
        this.setName("Chest");
        // Each chest will have exactly one random item for the time being.
        RandomItem newItem = new RandomItem();
        ChestInventory.add(newItem.randomItem());
        System.out.println("Chest created with the following items:");
        for (Item item : ChestInventory) {
            System.out.println(item.getName());
        }

    }
    public Item getItem(){
         return this.ChestInventory.get(0);
    }

    @Override
    public String toString() {
        return "C";
    }
}
