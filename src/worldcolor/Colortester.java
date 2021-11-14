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





//        GameBoard colortest = new GameBoard(15,20);
//        colortest.placeActor(goblin,9,1);
//        colortest.placeActor(human,6,4);
//        colortest.placeItem(mountains,1, 1);
//        colortest.placeItem(mountains,1, 2);
//        colortest.placeItem(mountains,2, 1);
//        colortest.placeItem(mountains,2, 2);
//        colortest.placeItem(mountains,0, 0);
//        colortest.placeItem(mountains,0, 1);
//        colortest.placeItem(mountains,1, 1);
//        colortest.placeItem(mountains,1, 0);
//        colortest.placeItem(mountains,2, 0);
//        colortest.placeItem(mountains,13, 19);
//        colortest.placeItem(mountains,14, 10);
//        colortest.placeItem(mountains,12, 15);
//        colortest.placeItem(water,13, 18);
//        colortest.placeItem(water,13, 17);
//        colortest.placeItem(water,13, 16);
//        colortest.placeItem(water,14, 18);
//        colortest.placeItem(water,4, 9);
//        colortest.placeItem(water,4, 10);
//        colortest.placeItem(water,14, 19);
//        colortest.placeItem(water,13, 19);
//        colortest.placeItem(loot,8, 12);
//        colortest.placeItem(loot,6, 0);
//        colortest.placeItem(tree,2,10);
//        colortest.placeItem(tree,2,9);
//        colortest.placeItem(tree,3,8);
//        colortest.placeItem(tree,3,8);
//        colortest.placeItem(tree,3,9);
//        colortest.placeItem(tree,3,10);
//        colortest.placeItem(tree,4,11);
//        colortest.placeItem(tree,3,11);
//        colortest.placeItem(tree,3,12);
//        colortest.placeItem(tree,2,17);
//        colortest.placeItem(tree,2,16);
//        colortest.placeItem(tree,3,18);
//        colortest.placeItem(tree,12,18);
//        colortest.placeItem(tree,14,12);
//        colortest.placeItem(tree,14,13);
//        colortest.placeItem(tree,14,11);
//        colortest.placeItem(tree,12,11);
//        colortest.placeItem(tree,13,12);
//        displayBoard(colortest,colorPicks,bgColor);

//    GameBoard dungeon = new GameBoard(7,20);
//    Tile tile = new Tile();
//    Boss boss = new Boss();
//        dungeon.placeItem(tile,0,0);
//        dungeon.placeItem(tile,0,1);
//        dungeon.placeItem(tile,0,2);
//        dungeon.placeItem(tile,0,3);
//        dungeon.placeItem(tile,0,4);
//        dungeon.placeItem(tile,0,5);
//        dungeon.placeItem(tile,0,6);
//        dungeon.placeItem(tile,0,7);
//        dungeon.placeItem(tile,0,8);
//        dungeon.placeItem(tile,0,9);
//        dungeon.placeItem(tile,0,10);
//        dungeon.placeItem(tile,0,11);
//        dungeon.placeItem(tile,0,12);
//        dungeon.placeItem(tile,0,13);
//        dungeon.placeItem(tile,0,14);
//        dungeon.placeItem(tile,0,15);
//        dungeon.placeItem(tile,0,16);
//        dungeon.placeItem(tile,0,17);
//        dungeon.placeItem(tile,0,18);
//        dungeon.placeItem(tile,0,19);
//
//        dungeon.placeItem(tile,1,0);
//        dungeon.placeItem(tile,1,1);
//        dungeon.placeItem(tile,1,2);
//        dungeon.placeItem(tile,1,3);
//        dungeon.placeItem(tile,1,4);
//        dungeon.placeItem(tile,1,5);
//        dungeon.placeItem(tile,1,6);
//        dungeon.placeItem(tile,1,7);
//        dungeon.placeItem(tile,1,8);
//        dungeon.placeItem(tile,1,9);
//        dungeon.placeItem(tile,1,10);
//        dungeon.placeItem(tile,1,11);
//        dungeon.placeItem(tile,1,12);
//        dungeon.placeItem(tile,1,13);
//        dungeon.placeItem(tile,1,14);
//        dungeon.placeItem(tile,1,15);
//        dungeon.placeItem(tile,1,16);
//        dungeon.placeItem(tile,1,17);
//        dungeon.placeItem(tile,1,18);
//        dungeon.placeItem(tile,1,19);
//        dungeon.placeItem(tile,2,0);
//        dungeon.placeItem(tile,2,1);
//        dungeon.placeItem(tile,2,2);
//        dungeon.placeItem(tile,2,3);
//        dungeon.placeItem(tile,2,4);
//        dungeon.placeItem(tile,2,5);
//        dungeon.placeItem(tile,2,6);
//        dungeon.placeItem(tile,2,7);
//        dungeon.placeItem(tile,2,8);
//        dungeon.placeItem(tile,2,9);
//        dungeon.placeItem(tile,2,10);
//        dungeon.placeItem(tile,2,11);
//        dungeon.placeItem(tile,2,12);
//        dungeon.placeItem(tile,2,13);
//        dungeon.placeItem(tile,2,14);
//        dungeon.placeItem(tile,2,15);
//        dungeon.placeItem(tile,2,16);
//        dungeon.placeItem(tile,2,17);
//        dungeon.placeItem(tile,2,18);
//        dungeon.placeItem(tile,2,19);
//        dungeon.placeItem(tile,3,0);
//        dungeon.placeItem(tile,3,1);
//        dungeon.placeItem(tile,3,2);
//        dungeon.placeItem(tile,3,3);
//        dungeon.placeItem(tile,3,4);
//        dungeon.placeItem(tile,3,5);
//        dungeon.placeItem(tile,3,6);
//        dungeon.placeItem(tile,3,7);
//        dungeon.placeItem(tile,3,8);
//        dungeon.placeItem(tile,3,9);
//        dungeon.placeItem(tile,3,10);
//        dungeon.placeItem(tile,3,11);
//        dungeon.placeItem(tile,3,12);
//        dungeon.placeItem(tile,3,13);
//        dungeon.placeItem(tile,3,14);
//        dungeon.placeItem(tile,3,15);
//        dungeon.placeItem(tile,3,16);
//        dungeon.placeItem(tile,3,17);
//        dungeon.placeItem(tile,3,18);
//        dungeon.placeItem(tile,3,19);
//        dungeon.placeItem(tile,4,0);
//        dungeon.placeItem(tile,4,1);
//        dungeon.placeItem(tile,4,2);
//        dungeon.placeItem(tile,4,3);
//        dungeon.placeItem(tile,4,4);
//        dungeon.placeItem(tile,4,5);
//        dungeon.placeItem(tile,4,6);
//        dungeon.placeItem(tile,4,7);
//        dungeon.placeItem(tile,4,8);
//        dungeon.placeItem(tile,4,9);
//        dungeon.placeItem(tile,4,10);
//        dungeon.placeItem(tile,4,11);
//        dungeon.placeItem(tile,4,12);
//        dungeon.placeItem(tile,4,13);
//        dungeon.placeItem(tile,4,14);
//        dungeon.placeItem(tile,4,15);
//        dungeon.placeItem(tile,4,16);
//        dungeon.placeItem(tile,4,17);
//        dungeon.placeItem(tile,4,18);
//        dungeon.placeItem(tile,4,19);
//        dungeon.placeItem(tile,5,0);
//        dungeon.placeItem(tile,5,1);
//        dungeon.placeItem(tile,5,2);
//        dungeon.placeItem(tile,5,3);
//        dungeon.placeItem(tile,5,4);
//        dungeon.placeItem(tile,5,5);
//        dungeon.placeItem(tile,5,6);
//        dungeon.placeItem(tile,5,7);
//        dungeon.placeItem(tile,5,8);
//        dungeon.placeItem(tile,5,9);
//        dungeon.placeItem(tile,5,10);
//        dungeon.placeItem(tile,5,11);
//        dungeon.placeItem(tile,5,12);
//        dungeon.placeItem(tile,5,13);
//        dungeon.placeItem(tile,5,14);
//        dungeon.placeItem(tile,5,15);
//        dungeon.placeItem(tile,5,16);
//        dungeon.placeItem(tile,5,17);
//        dungeon.placeItem(tile,5,18);
//        dungeon.placeItem(tile,5,19);
//        dungeon.placeItem(tile,6,0);
//        dungeon.placeItem(tile,6,1);
//        dungeon.placeItem(tile,6,2);
//        dungeon.placeItem(tile,6,3);
//        dungeon.placeItem(tile,6,4);
//        dungeon.placeItem(tile,6,5);
//        dungeon.placeItem(tile,6,6);
//        dungeon.placeItem(tile,6,7);
//        dungeon.placeItem(tile,6,8);
//        dungeon.placeItem(tile,6,9);
//        dungeon.placeItem(tile,6,10);
//        dungeon.placeItem(tile,6,11);
//        dungeon.placeItem(tile,6,12);
//        dungeon.placeItem(tile,6,13);
//        dungeon.placeItem(tile,6,14);
//        dungeon.placeItem(tile,6,15);
//        dungeon.placeItem(tile,6,16);
//        dungeon.placeItem(tile,6,17);
//        dungeon.placeItem(tile,6,18);
//        dungeon.placeItem(tile,6,19);
//        dungeon.placeItem(loot,3,18);
//        dungeon.placeActor(boss,3,9);
//        displayBoard(dungeon,colorPicks,bgColor);
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
