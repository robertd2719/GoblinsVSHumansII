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
    public static void populateChest(){
        ArrayList<Item> randomPool = new ArrayList<>();
    }
}
