package assets;
import item.HealthPotion;
import item.Item;
import java.util.ArrayList;

public class Chest extends NonActor{
    int row,column;
    String name;
    ArrayList<Item> ChestInventory = new ArrayList<>();

    public Chest(){
        this.setName("Chest");

    }
    public static void populateChest(){

    }
}
