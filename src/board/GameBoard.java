package board;
import assets.*;  // import the packages from assets to use in our gameboard implementations

public abstract class GameBoard {
    int width,height;
    Asset [][] gameBoard;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
