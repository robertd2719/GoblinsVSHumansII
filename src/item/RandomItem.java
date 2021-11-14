package item;

import java.util.ArrayList;
import java.util.Random;

public class RandomItem {
    Random rand = new Random();
    ArrayList<Item> randItems = new ArrayList<>();

    public RandomItem() {
        // Sword, LifeRing, AttackPotion, Cape, HealthPotion,
        // Shield
        this.randItems.add(new HealthPotion());
        this.randItems.add(new AttackPotion());
        this.randItems.add(new Sword());
        this.randItems.add(new Shield());
        this.randItems.add(new Cape());
        this.randItems.add(new LifeRing());
    }

    public Item randomItem() {
        int chosen_value = rand.nextInt(this.randItems.size());
        Item itemChosen = this.randItems.get(chosen_value);
        System.out.println("New item: " + itemChosen.getName());
        return itemChosen;
    }
}
