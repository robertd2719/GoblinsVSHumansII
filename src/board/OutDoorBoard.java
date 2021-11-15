package board;

import assets.Asset;
import assets.Chest;

public class OutDoorBoard extends GameBoard {
    private int rows;
    private int columns;

    public OutDoorBoard() {
        super(20, 20);
        Asset[][] board = new Asset[rows][columns];
        // populate all your trees and stuff
        this.placeItem(new Chest(), 19, 19);
        this.placeItem(new Chest(), 11, 11);
    }


}
