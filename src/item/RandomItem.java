package item;

import java.util.ArrayList;
import java.util.Random;

public class RandomItem {
    Random rand = new Random();
    ArrayList<Item> randItems = new ArrayList<>();

    RandomItem(){
        randItems.add(new HealthPotion());
        randItems.add(new AttackPotion());
        randItems.add(new Sword());
    }
}
