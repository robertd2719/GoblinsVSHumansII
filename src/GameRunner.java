import assets.Human;
import assets.Goblin;
import assets.LootChest;
import board.GameBoard;

public class GameRunner {
    public static void main(String[] args) {
        Human human = new Human();
        Goblin goblin = new Goblin();
        GameBoard board = new GameBoard(15,20);
        board.placeActor(goblin,3,3);
        board.moveItemRight(goblin,10);
        LootChest lootChest = new LootChest();
        board.placeItem(lootChest,1,5);
        board.displayBoard();

    }
}
