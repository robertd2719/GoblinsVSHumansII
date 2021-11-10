package board;

import assets.Asset;

public class GameBoard {
    private int rows;
    private int columns;
    Asset [][] board;

    public GameBoard(){
        this.rows = 10;
        this.columns = 10;
        this.board = new Asset[rows][columns];
    }

    public GameBoard(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
        this.board = new Asset[rows][columns];
    }

    public void displayBoard(){
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.columns; j++) {
                if (this.board[i][j] == null){
                    System.out.print("~ ");
                } else {
                    System.out.print(this.board[i][j]+" ");
                }
            }
            System.out.println();
        }
    }


    public void placeItem(Asset item,int row, int columns){
        this.board[row][columns] = item;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public Asset[][] getBoard() {
        return board;
    }

    public void setBoard(Asset[][] board) {
        this.board = board;
    }
}
