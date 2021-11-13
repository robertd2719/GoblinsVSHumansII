import assets.*;
import board.GameBoard;
import item.*;
import board.MoveDirection;

public class GameRunner {
    public static void main(String[] args) {
        Human human = new Human();
        Goblin goblin = new Goblin();
        GameBoard board = new GameBoard(15,20);
        board.placeActor(human,1,1);
        board.placeActor(goblin,5,5);
        board.displayBoard();
        board.trackEnemy(goblin,human);
        board.displayBoard();
        board.trackEnemy(goblin,human);
        board.displayBoard();
        board.trackEnemy(goblin,human);
        board.displayBoard();



    }
    public static void defaultMenu(){
        System.out.println("\t\t***** Main Menu ****");
        System.out.println("\t\t\t (M)ove");
        System.out.println("\t\t\t (A)ttack");
        System.out.println("\t\t\t (U)se Item");
        System.out.println("\t\t********* + *********");

    }

    public static void tesStats(Actor item){
        System.out.println("\n***** STATS ******");
        System.out.println("Name: \t\t"+item.getName());
        System.out.println("Health: \t"+item.getHealth());
        System.out.println("Attack: \t"+item.getAttack());
        System.out.println("Armor: \t"+item.getArmorClass());
        System.out.println("***** + ******");
    }


}
