package board;

import assets.Goblin;
import assets.Human;

public class BoardTester {
    public static void main(String[] args) {
        GameBoard board1 = new GameBoard();
        GameBoard board = new GameBoard(12,12);
        board.displayBoard();
    }
}
