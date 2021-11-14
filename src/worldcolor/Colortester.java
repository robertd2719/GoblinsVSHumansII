package worldcolor;

import board.GameBoard;
import assets.*;

import java.util.HashMap;


public class Colortester{
    public static void main(String[] args){
        HashMap<Colors, String> colorPicks;
        HashMap<BackgroundColors, String> bgColor;

        colorPicks = new HashMap<>();
        colorPicks.put(Colors.BLACK, "\u001B[41m");
        colorPicks.put(Colors.WHITE, "\u001B[42m");
        colorPicks.put(Colors.BLUE, "\u001B[34m");
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

        String RESET = "\u001B[0m";
        Goblin goblin = new Goblin();
        Human human = new Human();
        Mountain mountains = new Mountain();
        Tree tree = new Tree();
        LootChest loot = new LootChest();
        Water water = new Water();

        GameBoard level2 = new GameBoard(10,15);
        Volcano volcano = new Volcano();
        Castle castle = new Castle();



        level2.placeItem(volcano,9,13);
        level2.placeItem(volcano,8,14);
        level2.placeItem(volcano,9,14);
        level2.placeItem(volcano,6,9);
        level2.placeItem(volcano,9,14);
        level2.placeItem(water,0,0);
        level2.placeItem(water,1,0);
        level2.placeItem(water,1,1);
        level2.placeItem(water,1,2);
        level2.placeItem(tree,3, 6);
        level2.placeItem(tree,3, 7);
        level2.placeItem(tree,3, 8);
        level2.placeItem(tree,2, 5);
        level2.placeItem(tree,9, 6);
        level2.placeItem(tree,4, 7);
        level2.placeItem(tree,6, 8);
        level2.placeItem(tree,7, 5);
        level2.placeItem(loot,0,1);
        level2.placeItem(castle,5, 14);
        displayBoard(level2,colorPicks,bgColor );





//        GameBoard level1 = new GameBoard(15,20);
//        level1.placeActor(goblin,9,1);
//        level1.placeActor(human,6,4);
//        level1.placeItem(mountains,1, 1);
//        level1.placeItem(mountains,1, 2);
//        level1.placeItem(mountains,2, 1);
//        level1.placeItem(mountains,2, 2);
//        level1.placeItem(mountains,0, 0);
//        level1.placeItem(mountains,0, 1);
//        level1.placeItem(mountains,1, 1);
//        level1.placeItem(mountains,1, 0);
//        level1.placeItem(mountains,2, 0);
//        level1.placeItem(mountains,13, 19);
//        level1.placeItem(mountains,14, 10);
//        level1.placeItem(mountains,12, 15);
//        level1.placeItem(water,13, 18);
//        level1.placeItem(water,13, 17);
//        level1.placeItem(water,13, 16);
//        level1.placeItem(water,14, 18);
//        level1.placeItem(water,4, 9);
//        level1.placeItem(water,4, 10);
//        level1.placeItem(water,14, 19);
//        level1.placeItem(water,13, 19);
//        level1.placeItem(loot,8, 12);
//        level1.placeItem(loot,6, 0);
//        level1.placeItem(tree,2,10);
//        level1.placeItem(tree,2,9);
//        level1.placeItem(tree,3,8);
//        level1.placeItem(tree,3,8);
//        level1.placeItem(tree,3,9);
//        level1.placeItem(tree,3,10);
//        level1.placeItem(tree,4,11);
//        level1.placeItem(tree,3,11);
//        level1.placeItem(tree,3,12);
//        level1.placeItem(tree,2,17);
//        level1.placeItem(tree,2,16);
//        level1.placeItem(tree,3,18);
//        level1.placeItem(tree,12,18);
//        level1.placeItem(tree,14,12);
//        level1.placeItem(tree,14,13);
//        level1.placeItem(tree,14,11);
//        level1.placeItem(tree,12,11);
//        level1.placeItem(tree,13,12);
//        displayBoard(level1,colorPicks,bgColor);

//    GameBoard level3 = new GameBoard(7,20);
//    Tile tile = new Tile();
//    Boss boss = new Boss();
//        level3.placeItem(tile,0,0);
//        level3.placeItem(tile,0,1);
//        level3.placeItem(tile,0,2);
//        level3.placeItem(tile,0,3);
//        level3.placeItem(tile,0,4);
//        level3.placeItem(tile,0,5);
//        level3.placeItem(tile,0,6);
//        level3.placeItem(tile,0,7);
//        level3.placeItem(tile,0,8);
//        level3.placeItem(tile,0,9);
//        level3.placeItem(tile,0,10);
//        level3.placeItem(tile,0,11);
//        level3.placeItem(tile,0,12);
//        level3.placeItem(tile,0,13);
//        level3.placeItem(tile,0,14);
//        level3.placeItem(tile,0,15);
//        level3.placeItem(tile,0,16);
//        level3.placeItem(tile,0,17);
//        level3.placeItem(tile,0,18);
//        level3.placeItem(tile,0,19);
//
//        level3.placeItem(tile,1,0);
//        level3.placeItem(tile,1,1);
//        level3.placeItem(tile,1,2);
//        level3.placeItem(tile,1,3);
//        level3.placeItem(tile,1,4);
//        level3.placeItem(tile,1,5);
//        level3.placeItem(tile,1,6);
//        level3.placeItem(tile,1,7);
//        level3.placeItem(tile,1,8);
//        level3.placeItem(tile,1,9);
//        level3.placeItem(tile,1,10);
//        level3.placeItem(tile,1,11);
//        level3.placeItem(tile,1,12);
//        level3.placeItem(tile,1,13);
//        level3.placeItem(tile,1,14);
//        level3.placeItem(tile,1,15);
//        level3.placeItem(tile,1,16);
//        level3.placeItem(tile,1,17);
//        level3.placeItem(tile,1,18);
//        level3.placeItem(tile,1,19);
//        level3.placeItem(tile,2,0);
//        level3.placeItem(tile,2,1);
//        level3.placeItem(tile,2,2);
//        level3.placeItem(tile,2,3);
//        level3.placeItem(tile,2,4);
//        level3.placeItem(tile,2,5);
//        level3.placeItem(tile,2,6);
//        level3.placeItem(tile,2,7);
//        level3.placeItem(tile,2,8);
//        level3.placeItem(tile,2,9);
//        level3.placeItem(tile,2,10);
//        level3.placeItem(tile,2,11);
//        level3.placeItem(tile,2,12);
//        level3.placeItem(tile,2,13);
//        level3.placeItem(tile,2,14);
//        level3.placeItem(tile,2,15);
//        level3.placeItem(tile,2,16);
//        level3.placeItem(tile,2,17);
//        level3.placeItem(tile,2,18);
//        level3.placeItem(tile,2,19);
//        level3.placeItem(tile,3,0);
//        level3.placeItem(tile,3,1);
//        level3.placeItem(tile,3,2);
//        level3.placeItem(tile,3,3);
//        level3.placeItem(tile,3,4);
//        level3.placeItem(tile,3,5);
//        level3.placeItem(tile,3,6);
//        level3.placeItem(tile,3,7);
//        level3.placeItem(tile,3,8);
//        level3.placeItem(tile,3,9);
//        level3.placeItem(tile,3,10);
//        level3.placeItem(tile,3,11);
//        level3.placeItem(tile,3,12);
//        level3.placeItem(tile,3,13);
//        level3.placeItem(tile,3,14);
//        level3.placeItem(tile,3,15);
//        level3.placeItem(tile,3,16);
//        level3.placeItem(tile,3,17);
//        level3.placeItem(tile,3,18);
//        level3.placeItem(tile,3,19);
//        level3.placeItem(tile,4,0);
//        level3.placeItem(tile,4,1);
//        level3.placeItem(tile,4,2);
//        level3.placeItem(tile,4,3);
//        level3.placeItem(tile,4,4);
//        level3.placeItem(tile,4,5);
//        level3.placeItem(tile,4,6);
//        level3.placeItem(tile,4,7);
//        level3.placeItem(tile,4,8);
//        level3.placeItem(tile,4,9);
//        level3.placeItem(tile,4,10);
//        level3.placeItem(tile,4,11);
//        level3.placeItem(tile,4,12);
//        level3.placeItem(tile,4,13);
//        level3.placeItem(tile,4,14);
//        level3.placeItem(tile,4,15);
//        level3.placeItem(tile,4,16);
//        level3.placeItem(tile,4,17);
//        level3.placeItem(tile,4,18);
//        level3.placeItem(tile,4,19);
//        level3.placeItem(tile,5,0);
//        level3.placeItem(tile,5,1);
//        level3.placeItem(tile,5,2);
//        level3.placeItem(tile,5,3);
//        level3.placeItem(tile,5,4);
//        level3.placeItem(tile,5,5);
//        level3.placeItem(tile,5,6);
//        level3.placeItem(tile,5,7);
//        level3.placeItem(tile,5,8);
//        level3.placeItem(tile,5,9);
//        level3.placeItem(tile,5,10);
//        level3.placeItem(tile,5,11);
//        level3.placeItem(tile,5,12);
//        level3.placeItem(tile,5,13);
//        level3.placeItem(tile,5,14);
//        level3.placeItem(tile,5,15);
//        level3.placeItem(tile,5,16);
//        level3.placeItem(tile,5,17);
//        level3.placeItem(tile,5,18);
//        level3.placeItem(tile,5,19);
//        level3.placeItem(tile,6,0);
//        level3.placeItem(tile,6,1);
//        level3.placeItem(tile,6,2);
//        level3.placeItem(tile,6,3);
//        level3.placeItem(tile,6,4);
//        level3.placeItem(tile,6,5);
//        level3.placeItem(tile,6,6);
//        level3.placeItem(tile,6,7);
//        level3.placeItem(tile,6,8);
//        level3.placeItem(tile,6,9);
//        level3.placeItem(tile,6,10);
//        level3.placeItem(tile,6,11);
//        level3.placeItem(tile,6,12);
//        level3.placeItem(tile,6,13);
//        level3.placeItem(tile,6,14);
//        level3.placeItem(tile,6,15);
//        level3.placeItem(tile,6,16);
//        level3.placeItem(tile,6,17);
//        level3.placeItem(tile,6,18);
//        level3.placeItem(tile,6,19);
//        level3.placeItem(loot,3,18);
//        level3.placeActor(boss,3,9);
//        displayBoard(level3,colorPicks,bgColor);
    }
//WORKING COLORS
    //FG :WHITE W BG: CYAN, PRINTS A PATTERN THATS SLIGHTLY OFF

    public static void displayBoard(GameBoard board,HashMap colorPicks,HashMap bgColor) {
        String RESET = "\u001B[0m";
        String rice ="\uD83C\uDF3E";
        String grass = "\uD83C\uDF31";
        String herb = 	"\uD83C\uDF3F";
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                if (board.getBoard()[i][j] == null) {
                    System.out.print(herb);
                } else {
                    System.out.print(board.getBoard()[i][j]);
                }
            }
            System.out.println(RESET);
        }
    }
}
