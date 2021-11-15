package board;
import assets.Asset;

public class OutDoorBoard extends GameBoard {
    private int rows;
    private int columns;

    public OutDoorBoard() {
        this.rows = 10;
        this.columns = 10;
        Asset[][] board = new Asset[rows][columns];
        // populate all your trees and stuff
    }

    @Override
    public void displayBoard() {
        // write your code here....
    }
}
