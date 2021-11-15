package board;

import assets.*;


public class BossStage extends GameBoard {
    private int rows;
    private int columns;



    public BossStage(){
        super(7,20);
        Asset[][] board = new Asset [rows][columns];
        this.placeItem(new Tile(),0,0);
        this.placeItem(new Tile(),0,1);
        this.placeItem(new Tile(),0,2);
        this.placeItem(new Tile(),0,3);
        this.placeItem(new Tile(),0,4);
        this.placeItem(new Tile(),0,5);
        this.placeItem(new Tile(),0,6);
        this.placeItem(new Tile(),0,7);
        this.placeItem(new Tile(),0,8);
        this.placeItem(new Tile(),0,9);
        this.placeItem(new Tile(),0,10);
        this.placeItem(new Tile(),0,11);
        this.placeItem(new Tile(),0,12);
        this.placeItem(new Tile(),0,13);
        this.placeItem(new Tile(),0,14);
        this.placeItem(new Tile(),0,15);
        this.placeItem(new Tile(),0,16);
        this.placeItem(new Tile(),0,17);
        this.placeItem(new Tile(),0,18);
        this.placeItem(new Tile(),0,19);
        this.placeItem(new Tile(),1,0);
        this.placeItem(new Tile(),1,1);
        this.placeItem(new Tile(),1,2);
        this.placeItem(new Tile(),1,3);
        this.placeItem(new Tile(),1,4);
        this.placeItem(new Tile(),1,5);
        this.placeItem(new Tile(),1,6);
        this.placeItem(new Tile(),1,7);
        this.placeItem(new Tile(),1,8);
        this.placeItem(new Tile(),1,9);
        this.placeItem(new Tile(),1,10);
        this.placeItem(new Tile(),1,11);
        this.placeItem(new Tile(),1,12);
        this.placeItem(new Tile(),1,13);
        this.placeItem(new Tile(),1,14);
        this.placeItem(new Tile(),1,15);
        this.placeItem(new Tile(),1,16);
        this.placeItem(new Tile(),1,17);
        this.placeItem(new Tile(),1,18);
        this.placeItem(new Tile(),1,19);
        this.placeItem(new Tile(),2,0);
        this.placeItem(new Tile(),2,1);
        this.placeItem(new Tile(),2,2);
        this.placeItem(new Tile(),2,3);
        this.placeItem(new Tile(),2,4);
        this.placeItem(new Tile(),2,5);
        this.placeItem(new Tile(),2,6);
        this.placeItem(new Tile(),2,7);
        this.placeItem(new Tile(),2,8);
        this.placeItem(new Tile(),2,9);
        this.placeItem(new Tile(),2,10);
        this.placeItem(new Tile(),2,11);
        this.placeItem(new Tile(),2,12);
        this.placeItem(new Tile(),2,13);
        this.placeItem(new Tile(),2,14);
        this.placeItem(new Tile(),2,15);
        this.placeItem(new Tile(),2,16);
        this.placeItem(new Tile(),2,17);
        this.placeItem(new Tile(),2,18);
        this.placeItem(new Tile(),2,19);
        this.placeItem(new Tile(),3,0);
        this.placeItem(new Tile(),3,1);
        this.placeItem(new Tile(),3,2);
        this.placeItem(new Tile(),3,3);
        this.placeItem(new Tile(),3,4);
        this.placeItem(new Tile(),3,5);
        this.placeItem(new Tile(),3,6);
        this.placeItem(new Tile(),3,7);
        this.placeItem(new Tile(),3,8);
        this.placeItem(new Tile(),3,9);
        this.placeItem(new Tile(),3,10);
        this.placeItem(new Tile(),3,11);
        this.placeItem(new Tile(),3,12);
        this.placeItem(new Tile(),3,13);
        this.placeItem(new Tile(),3,14);
        this.placeItem(new Tile(),3,15);
        this.placeItem(new Tile(),3,16);
        this.placeItem(new Tile(),3,17);
        this.placeItem(new Tile(),3,18);
        this.placeItem(new Tile(),3,19);
        this.placeItem(new Tile(),4,0);
        this.placeItem(new Tile(),4,1);
        this.placeItem(new Tile(),4,2);
        this.placeItem(new Tile(),4,3);
        this.placeItem(new Tile(),4,4);
        this.placeItem(new Tile(),4,5);
        this.placeItem(new Tile(),4,6);
        this.placeItem(new Tile(),4,7);
        this.placeItem(new Tile(),4,8);
        this.placeItem(new Tile(),4,9);
        this.placeItem(new Tile(),4,10);
        this.placeItem(new Tile(),4,11);
        this.placeItem(new Tile(),4,12);
        this.placeItem(new Tile(),4,13);
        this.placeItem(new Tile(),4,14);
        this.placeItem(new Tile(),4,15);
        this.placeItem(new Tile(),4,16);
        this.placeItem(new Tile(),4,17);
        this.placeItem(new Tile(),4,18);
        this.placeItem(new Tile(),4,19);
        this.placeItem(new Tile(),5,0);
        this.placeItem(new Tile(),5,1);
        this.placeItem(new Tile(),5,2);
        this.placeItem(new Tile(),5,3);
        this.placeItem(new Tile(),5,4);
        this.placeItem(new Tile(),5,5);
        this.placeItem(new Tile(),5,6);
        this.placeItem(new Tile(),5,7);
        this.placeItem(new Tile(),5,8);
        this.placeItem(new Tile(),5,9);
        this.placeItem(new Tile(),5,10);
        this.placeItem(new Tile(),5,11);
        this.placeItem(new Tile(),5,12);
        this.placeItem(new Tile(),5,13);
        this.placeItem(new Tile(),5,14);
        this.placeItem(new Tile(),5,15);
        this.placeItem(new Tile(),5,16);
        this.placeItem(new Tile(),5,17);
        this.placeItem(new Tile(),5,18);
        this.placeItem(new Tile(),5,19);
        this.placeItem(new Tile(),6,0);
        this.placeItem(new Tile(),6,1);
        this.placeItem(new Tile(),6,2);
        this.placeItem(new Tile(),6,3);
        this.placeItem(new Tile(),6,4);
        this.placeItem(new Tile(),6,5);
        this.placeItem(new Tile(),6,6);
        this.placeItem(new Tile(),6,7);
        this.placeItem(new Tile(),6,8);
        this.placeItem(new Tile(),6,9);
        this.placeItem(new Tile(),6,10);
        this.placeItem(new Tile(),6,11);
        this.placeItem(new Tile(),6,12);
        this.placeItem(new Tile(),6,13);
        this.placeItem(new Tile(),6,14);
        this.placeItem(new Tile(),6,15);
        this.placeItem(new Tile(),6,16);
        this.placeItem(new Tile(),6,17);
        this.placeItem(new Tile(),6,18);
        this.placeItem(new Tile(),6,19);
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
                    System.out.print(this.board[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println(RESET);
    }
}
