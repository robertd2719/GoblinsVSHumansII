import assets.Human;
import board.GameBoard;

public class GameRunner {
    public static void main(String[] args) {
        Human human = new Human();
        GameBoard board = new GameBoard(10,10);
        board.displayBoard();
    }
}
