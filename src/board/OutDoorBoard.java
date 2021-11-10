package board;
import assets.Asset;

public class OutDoorBoard {
    private int rows;
    private int columns;

    public OutDoorBoard(){
        this.rows = 10;
        this.columns = 10;
        Asset [][] board = new Asset [rows][columns];
    }
    public OutDoorBoard(int rows,int columns){
        this.rows=rows;
        this.columns=columns;
        Asset [][] board = new Asset[rows][columns];
    }
}
