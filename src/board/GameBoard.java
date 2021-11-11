package board;

import assets.Actor;
import assets.Asset;
import assets.NonActor;

public class GameBoard {
    private int rows;
    private int columns;
    Asset[][] board;

    public GameBoard() {
        this.rows = 10;
        this.columns = 10;
        this.board = new Asset[rows][columns];
    }

    public GameBoard(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.board = new Asset[rows][columns];
    }

    public void moveItemUp(Actor item, int spaces){
        try{
            if(item.getRowPosition() - spaces < 0 ){
                throw new Exception();
            } else {
                this.board[item.getRowPosition()][item.getColumnPosition()] = null;
                item.setRowPosition(item.getRowPosition() - spaces);
                this.board[item.getRowPosition()][item.getColumnPosition()] = item;
            }
        } catch (Exception err){
            System.out.println("Unable to move up by that amount");
        }

    }

    public void moveItemDown(Actor item, int spaces){
        try{
            if(item.getRowPosition() + spaces > this.getRows()-1 ){
                throw new Exception();
            } else {
                this.board[item.getRowPosition()][item.getColumnPosition()] = null;
                item.setRowPosition(item.getRowPosition() + spaces);
                this.board[item.getRowPosition()][item.getColumnPosition()] = item;
            }
        } catch (Exception err){
            System.out.println("Unable to move down by that amount");
        }
    }

    public void moveItemLeft(Actor item, int spaces) {
        // move item left spaces number of elements
        try {
            // Is this a legal move?
            if (item.getColumnPosition() - spaces < 0) {
                throw new Exception();
                // if legal move update position in board
            } else {
                // update items internal data on its position and update board
                this.board[item.getRowPosition()][item.getColumnPosition()] = null;
                item.setColumnPosition(item.getColumnPosition() - spaces);
                this.board[item.getRowPosition()][item.getColumnPosition()] = item;
                return;
            }
        } catch (Exception e) {
            System.out.println("Sorry you can not move that many spaces left!");
            return;
        }
    }

    public void moveItemRight(Actor item, int spaces){
        // move item left spaces number of elements
        try {
            // Is this a legal move?
            if (item.getColumnPosition() + spaces >board.length) {
                throw new Exception();
                // if legal move update position in board
            } else {
                // update items internal data on its position and update board
                this.board[item.getRowPosition()][item.getColumnPosition()] = null;
                item.setColumnPosition(item.getColumnPosition() + spaces);
                this.board[item.getRowPosition()][item.getColumnPosition()] = item;
                return;
            }
        } catch (Exception e) {
            System.out.println("Sorry you can not move that many spaces right!");
            return;
        }
    }

    public void displayBoard() {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.columns; j++) {
                if (this.board[i][j] == null) {
                    System.out.print("~ ");
                } else {
                    System.out.print(this.board[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    // This method will allow for placement of actor items
    public void placeActor(Actor item, int row, int column) {
        this.board[row][column] = item;
        item.setPosition(row, column);
        // @TODO remove below -- testing only --
        System.out.println("New " + item.getClass() + " added.");
        System.out.println("Coordinates of: " + item.getRowPosition()
                + ", " + item.getColumnPosition());
    }
//  This method will allow for placement of non-Actor items in board.
    public void placeItem(NonActor item, int row, int column){
        this.board[row][column] = item;
        item.setPosition(row,column);
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
