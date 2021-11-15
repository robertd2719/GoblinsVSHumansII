package board;

import assets.Actor;
import assets.Asset;
import assets.NonActor;

public class GameBoard {
    int rows;
    int columns;
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

    public void moveItemUp(Actor item, int spaces) {
        // Note: movement down and up are reversed
        int targetRow = item.getRowPosition() - spaces;
        int currentCol = item.getColumnPosition();
        // Is this a legal move?
        try {
            if (targetRow < 0 || this.board[targetRow][currentCol] != null) {
                throw new Exception();
            } else {
                this.board[item.getRowPosition()][item.getColumnPosition()] = null;
                item.setRowPosition(targetRow);
//                this.board[item.getRowPosition()][item.getColumnPosition()] = item;
                this.board[targetRow][currentCol] = item;
            }
        } catch (Exception err) {
            System.out.println("Sorry, illegal move - up");
        }

    }

    public void moveItemDown(Actor item, int spaces) {
        // Note: movement down and up are reversed inverted
        int targetRow = item.getRowPosition() + spaces;
        int currentCol = item.getColumnPosition();
        // Is this a legal move ?
        try {
            if (targetRow > this.getRows() - spaces || this.board[targetRow][currentCol] != null) {
                throw new Exception();
            } else {
                this.board[item.getRowPosition()][item.getColumnPosition()] = null;
                item.setRowPosition(targetRow);
                this.board[item.getRowPosition()][item.getColumnPosition()] = item;
            }
        } catch (Exception err) {
            System.out.println("Sorry, illegal move - down");
        }
    }

    public void moveItemLeft(Actor item, int spaces) {
        // move item left spaces number of elements, values increase left to right in array grid.
        int targetCol = item.getColumnPosition() - spaces;
        int currentRow = item.getRowPosition();
        try {
            // Is this a legal move?

            if (targetCol < 0 || this.board[currentRow][targetCol] != null) {
                throw new Exception();
                // if legal move update position in board
            } else {
                // update items internal data on its position and update board
                this.board[item.getRowPosition()][item.getColumnPosition()] = null;
                item.setColumnPosition(targetCol);
                this.board[item.getRowPosition()][item.getColumnPosition()] = item;
                return;
            }
        } catch (Exception e) {
            System.out.println("Sorry, illegal move -left");
            return;
        }
    }

    public void moveItemRight(Actor item, int spaces) {
        int targetCol = item.getColumnPosition() + spaces;
        int currentRow = item.getRowPosition();
        // move item left spaces number of elements
        try {
            // Is this a legal move?
            if (targetCol > board.length || this.board[currentRow][targetCol] != null) {
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

    public void trackEnemy(Actor actor, Actor target) {
        int actorRow = actor.getRowPosition();
        int actorCol = actor.getColumnPosition();
        int targetRow = target.getRowPosition();
        int targetCol = target.getColumnPosition();
        // move goblin horizontally first
        if (actorRow > targetRow) {
            this.moveItemUp(actor, 1);
            if (actor.canAttack(target)) {
                actor.attack(target);
            }
        }
        if (actorRow < targetRow) {
            this.moveItemDown(actor, 1);
            if (actor.canAttack(target)) {
                actor.attack(target);
            }
        }
        if (actorCol < targetCol) {
            this.moveItemRight(actor, 1);
            if (actor.canAttack(target)) {
                actor.attack(target);
            }
        }
        if (actorCol > targetCol) {
            this.moveItemLeft(actor, 1);
            if (actor.canAttack(target)) {
                actor.attack(target);
            }
        }

    }

    public void displayBoard() {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.columns; j++) {
                if (this.board[i][j] == null) {
                    System.out.print("~ ");
//                    System.out.print("\uD83C\uDF2B");
                } else {
                    System.out.print(this.board[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    // This method will allow for placement of actor items
    public void placeActor(Actor item, int row, int column) {
        this.board[row][column] = item;
        item.setPosition(row, column);
        // @TODO remove below -- testing only --
//        System.out.println("New " + item.getClass() + " added.");
//        System.out.println("Coordinates of: " + item.getRowPosition()
//                + ", " + item.getColumnPosition());
    }

    //  This method will allow for placement of non-Actor items in board.
    public void placeItem(NonActor item, int row, int column) {
        this.board[row][column] = item;
        item.setPosition(row, column);
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

    public void removeItem(Actor actor) {
        // remove item from the gameboard
        this.board[actor.getRowPosition()][actor.getColumnPosition()] = null;

    }
}
