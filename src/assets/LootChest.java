package assets;
import item.Item;
import java.util.ArrayList;

public class LootChest extends NonActor{
    int row,column;
    String name;
    ArrayList<Item> ChestInventory = new ArrayList<>();

    public LootChest(){
        this.setName("Chest");
        // we need to load the arrayList with random goodies
    }
}
