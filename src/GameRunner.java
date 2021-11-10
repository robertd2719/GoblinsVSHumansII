import assets.Human;
import assets.Goblin;
import board.GameBoard;

public class GameRunner {
    public static void main(String[] args) {
        Human human = new Human();
        GameBoard board = new GameBoard(10,10);
        board.placeItem(new Goblin(),1,1);
        board.placeItem(new Human(), 1,2);
        board.placeItem(new Goblin(), 3,3);
        board.placeItem(new Human(),2,2);
        board.displayBoard();
    }
}
