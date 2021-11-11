import assets.*;
import board.GameBoard;
import item.AttackPotion;
import item.HealthPotion;
import item.Sword;

public class GameRunner {
    public static void main(String[] args) {
        Human human = new Human();
        Goblin goblin = new Goblin();
        GameBoard board = new GameBoard(15,20);
        board.placeActor(goblin,3,3);
        board.placeActor(human, 5,5);
        board.moveItemRight(goblin,10);
        LootChest lootChest = new LootChest();
        board.placeItem(lootChest,1,5);

        board.displayBoard();
        tesStats(goblin);
        goblin.useItem(new AttackPotion());
        goblin.useItem(new HealthPotion());
        human.useItem(new HealthPotion());
        human.useItem(new AttackPotion());
        human.useItem(new Sword());
        tesStats(goblin);
        tesStats(human);

    }
    public static void tesStats(Actor item){
        System.out.println("\n***** STATS ******");
        System.out.println("Name: \t"+item.getName());
        System.out.println("Health: \t"+item.getHealth());
        System.out.println("Attack: \t"+item.getAttack());
        System.out.println("***** + ******");
    }
}
