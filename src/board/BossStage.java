package board;

import assets.*;


public class BossStage extends GameBoard {
    private int rows;
    private int columns;
    Tile tile = new Tile();


    public BossStage(){
        this.rows = 7;
        this.columns = 20;
        Asset[][] board = new Asset [rows][columns];
        Tile tile = new Tile();
        BossStage bossStage = new BossStage();
        bossStage.placeItem(tile,0,0);
        bossStage.placeItem(tile,0,1);
        bossStage.placeItem(tile,0,2);
        bossStage.placeItem(tile,0,3);
        bossStage.placeItem(tile,0,4);
        bossStage.placeItem(tile,0,5);
        bossStage.placeItem(tile,0,6);
        bossStage.placeItem(tile,0,7);
        bossStage.placeItem(tile,0,8);
        bossStage.placeItem(tile,0,9);
        bossStage.placeItem(tile,0,10);
        bossStage.placeItem(tile,0,11);
        bossStage.placeItem(tile,0,12);
        bossStage.placeItem(tile,0,13);
        bossStage.placeItem(tile,0,14);
        bossStage.placeItem(tile,0,15);
        bossStage.placeItem(tile,0,16);
        bossStage.placeItem(tile,0,17);
        bossStage.placeItem(tile,0,18);
        bossStage.placeItem(tile,0,19);
        bossStage.placeItem(tile,1,0);
        bossStage.placeItem(tile,1,1);
        bossStage.placeItem(tile,1,2);
        bossStage.placeItem(tile,1,3);
        bossStage.placeItem(tile,1,4);
        bossStage.placeItem(tile,1,5);
        bossStage.placeItem(tile,1,6);
        bossStage.placeItem(tile,1,7);
        bossStage.placeItem(tile,1,8);
        bossStage.placeItem(tile,1,9);
        bossStage.placeItem(tile,1,10);
        bossStage.placeItem(tile,1,11);
        bossStage.placeItem(tile,1,12);
        bossStage.placeItem(tile,1,13);
        bossStage.placeItem(tile,1,14);
        bossStage.placeItem(tile,1,15);
        bossStage.placeItem(tile,1,16);
        bossStage.placeItem(tile,1,17);
        bossStage.placeItem(tile,1,18);
        bossStage.placeItem(tile,1,19);
        bossStage.placeItem(tile,2,0);
        bossStage.placeItem(tile,2,1);
        bossStage.placeItem(tile,2,2);
        bossStage.placeItem(tile,2,3);
        bossStage.placeItem(tile,2,4);
        bossStage.placeItem(tile,2,5);
        bossStage.placeItem(tile,2,6);
        bossStage.placeItem(tile,2,7);
        bossStage.placeItem(tile,2,8);
        bossStage.placeItem(tile,2,9);
        bossStage.placeItem(tile,2,10);
        bossStage.placeItem(tile,2,11);
        bossStage.placeItem(tile,2,12);
        bossStage.placeItem(tile,2,13);
        bossStage.placeItem(tile,2,14);
        bossStage.placeItem(tile,2,15);
        bossStage.placeItem(tile,2,16);
        bossStage.placeItem(tile,2,17);
        bossStage.placeItem(tile,2,18);
        bossStage.placeItem(tile,2,19);
        bossStage.placeItem(tile,3,0);
        bossStage.placeItem(tile,3,1);
        bossStage.placeItem(tile,3,2);
        bossStage.placeItem(tile,3,3);
        bossStage.placeItem(tile,3,4);
        bossStage.placeItem(tile,3,5);
        bossStage.placeItem(tile,3,6);
        bossStage.placeItem(tile,3,7);
        bossStage.placeItem(tile,3,8);
        bossStage.placeItem(tile,3,9);
        bossStage.placeItem(tile,3,10);
        bossStage.placeItem(tile,3,11);
        bossStage.placeItem(tile,3,12);
        bossStage.placeItem(tile,3,13);
        bossStage.placeItem(tile,3,14);
        bossStage.placeItem(tile,3,15);
        bossStage.placeItem(tile,3,16);
        bossStage.placeItem(tile,3,17);
        bossStage.placeItem(tile,3,18);
        bossStage.placeItem(tile,3,19);
        bossStage.placeItem(tile,4,0);
        bossStage.placeItem(tile,4,1);
        bossStage.placeItem(tile,4,2);
        bossStage.placeItem(tile,4,3);
        bossStage.placeItem(tile,4,4);
        bossStage.placeItem(tile,4,5);
        bossStage.placeItem(tile,4,6);
        bossStage.placeItem(tile,4,7);
        bossStage.placeItem(tile,4,8);
        bossStage.placeItem(tile,4,9);
        bossStage.placeItem(tile,4,10);
        bossStage.placeItem(tile,4,11);
        bossStage.placeItem(tile,4,12);
        bossStage.placeItem(tile,4,13);
        bossStage.placeItem(tile,4,14);
        bossStage.placeItem(tile,4,15);
        bossStage.placeItem(tile,4,16);
        bossStage.placeItem(tile,4,17);
        bossStage.placeItem(tile,4,18);
        bossStage.placeItem(tile,4,19);
        bossStage.placeItem(tile,5,0);
        bossStage.placeItem(tile,5,1);
        bossStage.placeItem(tile,5,2);
        bossStage.placeItem(tile,5,3);
        bossStage.placeItem(tile,5,4);
        bossStage.placeItem(tile,5,5);
        bossStage.placeItem(tile,5,6);
        bossStage.placeItem(tile,5,7);
        bossStage.placeItem(tile,5,8);
        bossStage.placeItem(tile,5,9);
        bossStage.placeItem(tile,5,10);
        bossStage.placeItem(tile,5,11);
        bossStage.placeItem(tile,5,12);
        bossStage.placeItem(tile,5,13);
        bossStage.placeItem(tile,5,14);
        bossStage.placeItem(tile,5,15);
        bossStage.placeItem(tile,5,16);
        bossStage.placeItem(tile,5,17);
        bossStage.placeItem(tile,5,18);
        bossStage.placeItem(tile,5,19);
        bossStage.placeItem(tile,6,0);
        bossStage.placeItem(tile,6,1);
        bossStage.placeItem(tile,6,2);
        bossStage.placeItem(tile,6,3);
        bossStage.placeItem(tile,6,4);
        bossStage.placeItem(tile,6,5);
        bossStage.placeItem(tile,6,6);
        bossStage.placeItem(tile,6,7);
        bossStage.placeItem(tile,6,8);
        bossStage.placeItem(tile,6,9);
        bossStage.placeItem(tile,6,10);
        bossStage.placeItem(tile,6,11);
        bossStage.placeItem(tile,6,12);
        bossStage.placeItem(tile,6,13);
        bossStage.placeItem(tile,6,14);
        bossStage.placeItem(tile,6,15);
        bossStage.placeItem(tile,6,16);
        bossStage.placeItem(tile,6,17);
        bossStage.placeItem(tile,6,18);
        bossStage.placeItem(tile,6,19);

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
