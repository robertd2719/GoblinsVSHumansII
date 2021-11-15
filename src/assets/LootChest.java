package assets;
import item.HealthPotion;
import item.Item;
import java.util.ArrayList;

public class LootChest extends NonActor{
    int row,column;
    String name;
    ArrayList<Item> ChestInventory = new ArrayList<>();

    public LootChest(){
        this.setName("Chest");

    }
<<<<<<< HEAD
    public String toString() {
        return "\uD83E\uDDF3";
    }
=======
>>>>>>> master
    public static void populateChest(){
        ArrayList<Item> randomPool = new ArrayList<>();
    }
}
