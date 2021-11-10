import assets.Human;
import assets.Goblin;
import board.GameBoard;

public class GameRunner {
    public static void main(String[] args) {
        Human human = new Human();
        Goblin goblin = new Goblin();
        GameBoard board = new GameBoard(10,10);
        board.placeItem(goblin,0,0);
        board.placeItem(human,1,1);
        board.moveItemLeft(human,1);
        board.moveItemRight(human,2);
        board.moveItemRight(goblin,5);
        board.moveItemRight(goblin,15);
        board.displayBoard();

    }
}
