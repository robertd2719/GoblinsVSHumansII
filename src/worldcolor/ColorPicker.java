package worldcolor;

import assets.Asset;
import item.Item;
import board.GameBoard;
import java.util.HashMap;

public class ColorPicker {
    public static void main(String[] args) {
      HashMap<Colors, String> colorPicks;
      HashMap<BackgroundColors, String> bgColor;

        colorPicks = new HashMap<>();
        colorPicks.put(Colors.BLACK, "\u001B[41m");
        colorPicks.put(Colors.WHITE, "\u001B[42m");
        colorPicks.put(Colors.BLUE, "\u001B[42m");
        colorPicks.put(Colors.RED, "\u001B[31m");
        colorPicks.put(Colors.CYAN, "\u001B[36m");
        colorPicks.put(Colors.PURPLE, "\u001B[35m");
        colorPicks.put(Colors.YELLOW, "\u001B[33m");
        colorPicks.put(Colors.GREEN, "\u001B[32m");

        bgColor = new HashMap<>();
        bgColor.put(BackgroundColors.BLACK, "\u001B[40m");
        bgColor.put(BackgroundColors.WHITE, "\u001B[47m");
        bgColor.put(BackgroundColors.CYAN, "\u001B[46m");
        bgColor.put(BackgroundColors.PURPLE, "\u001B[45m");
        bgColor.put(BackgroundColors.RED, "\u001B[41m");
        bgColor.put(BackgroundColors.YELLOW, "\u001B[43m");
        bgColor.put(BackgroundColors.BLUE, "\u001B[44m");
        bgColor.put(BackgroundColors.GREEN, "\u001B[42m");
    }
}
//public static void colorSet(board Board, Colors color, BackgroundColors backgroundColors){
//
//    color
//}
