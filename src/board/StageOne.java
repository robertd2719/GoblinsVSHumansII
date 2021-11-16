package board;

import assets.Asset;
import assets.Mountain;
import assets.Tree;
import assets.Water;

public class StageOne extends GameBoard{
    private int rows;
    private int columns;

    public StageOne(){
        super(15,20);
        Asset[][] board = new Asset [rows][columns];
        this.placeItem(new Mountain(),1, 1);
        this.placeItem(new Mountain(),1, 2);
        this.placeItem(new Mountain(),2, 1);
        this.placeItem(new Mountain(),2, 2);
        this.placeItem(new Mountain(),0, 0);
        this.placeItem(new Mountain(),0, 1);
        this.placeItem(new Mountain(),1, 1);
        this.placeItem(new Mountain(),1, 0);
        this.placeItem(new Mountain(),2, 0);
        this.placeItem(new Mountain(),13, 19);
        this.placeItem(new Mountain(),14, 10);
        this.placeItem(new Mountain(),12, 15);
        this.placeItem(new Water(),13, 18);
        this.placeItem(new Water(),13, 17);
        this.placeItem(new Water(),13, 16);
        this.placeItem(new Water(),14, 18);
        this.placeItem(new Water(),4, 9);
        this.placeItem(new Water(),4, 10);
        this.placeItem(new Water(),14, 19);
        this.placeItem(new Water(),13, 19);
        this.placeItem(new Tree(),2,10);
        this.placeItem(new Tree(),2,9);
        this.placeItem(new Tree(),3,8);
        this.placeItem(new Tree(),3,8);
        this.placeItem(new Tree(),3,9);
        this.placeItem(new Tree(),3,10);
        this.placeItem(new Tree(),4,11);
        this.placeItem(new Tree(),3,11);
        this.placeItem(new Tree(),3,12);
        this.placeItem(new Tree(),2,17);
        this.placeItem(new Tree(),2,16);
        this.placeItem(new Tree(),3,18);
        this.placeItem(new Tree(),12,18);
        this.placeItem(new Tree(),14,12);
        this.placeItem(new Tree(),14,13);
        this.placeItem(new Tree(),14,11);
        this.placeItem(new Tree(),12,11);
        this.placeItem(new Tree(),13,12);
    }

    @Override
    public void displayBoard() {
        String RESET = "\u001B[0m";
        String herb = 	"\uD83C\uDF3F";
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if (this.board[i][j] == null) {
                    System.out.print(herb);
                } else {
                    System.out.print(this.board[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println(RESET);
    }
}
