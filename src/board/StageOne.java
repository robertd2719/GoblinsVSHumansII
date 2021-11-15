package board;

import assets.*;

public class StageOne extends GameBoard{
    private int rows;
    private int columns;
    Mountain mountains = new Mountain();
    Water water = new Water();
    Tree tree = new Tree();


    public StageOne(){
        this.rows = 15;
        this.columns = 20;
        Asset[][] board = new Asset [rows][columns];
        StageOne stageOne = new StageOne();
        stageOne.placeItem(mountains,1, 1);
        stageOne.placeItem(mountains,1, 2);
        stageOne.placeItem(mountains,2, 1);
        stageOne.placeItem(mountains,2, 2);
        stageOne.placeItem(mountains,0, 0);
        stageOne.placeItem(mountains,0, 1);
        stageOne.placeItem(mountains,1, 1);
        stageOne.placeItem(mountains,1, 0);
        stageOne.placeItem(mountains,2, 0);
        stageOne.placeItem(mountains,13, 19);
        stageOne.placeItem(mountains,14, 10);
        stageOne.placeItem(mountains,12, 15);
        stageOne.placeItem(water,13, 18);
        stageOne.placeItem(water,13, 17);
        stageOne.placeItem(water,13, 16);
        stageOne.placeItem(water,14, 18);
        stageOne.placeItem(water,4, 9);
        stageOne.placeItem(water,4, 10);
        stageOne.placeItem(water,14, 19);
        stageOne.placeItem(water,13, 19);
        stageOne.placeItem(tree,2,10);
        stageOne.placeItem(tree,2,9);
        stageOne.placeItem(tree,3,8);
        stageOne.placeItem(tree,3,8);
        stageOne.placeItem(tree,3,9);
        stageOne.placeItem(tree,3,10);
        stageOne.placeItem(tree,4,11);
        stageOne.placeItem(tree,3,11);
        stageOne.placeItem(tree,3,12);
        stageOne.placeItem(tree,2,17);
        stageOne.placeItem(tree,2,16);
        stageOne.placeItem(tree,3,18);
        stageOne.placeItem(tree,12,18);
        stageOne.placeItem(tree,14,12);
        stageOne.placeItem(tree,14,13);
        stageOne.placeItem(tree,14,11);
        stageOne.placeItem(tree,12,11);
        stageOne.placeItem(tree,13,12);
    }

    @Override
    public void displayBoard() {
        String herb = 	"\uD83C\uDF3F";
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.columns; j++) {
                if (this.board[i][j] == null) {
                    System.out.print(herb);
                } else {
                    System.out.print(this.board[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
