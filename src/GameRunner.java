import assets.Actor;
import assets.Goblin;
import assets.Human;
import board.GameBoard;

import java.util.Scanner;

public class GameRunner {
    public static void main(String[] args) {
        MainLoop();
    }

    public static void displayMenu() {
        System.out.println("\t\t***** Main Menu ****");
        System.out.println("\t\t\t (M)ove");
        System.out.println("\t\t\t (A)ttack");
        System.out.println("\t\t\t (U)se Item");
        System.out.println("\t\t********* + *********");

    }

    public static void tesStats(Actor item) {
        System.out.println("\n***** STATS ******");
        System.out.println("Name: \t\t" + item.getName());
        System.out.println("Health: \t" + item.getHealth());
        System.out.println("Attack: \t" + item.getAttack());
        System.out.println("Armor: \t" + item.getArmorClass());
        System.out.println("***** + ******");
    }

    public static void MainLoop() {
        Human human = new Human();
        Goblin goblin = new Goblin();
        GameBoard board = new GameBoard(15, 20);
        board.placeActor(human, 1, 1);
        board.placeActor(goblin, 5, 5);
        board.displayBoard();
        while (true) {
            displayOptions();
            var reply = getPlayerInput();
            System.out.println("player chose: " + reply);
        }
    }

    public static String getPlayerInput() {
        String playerInput = "";
        Scanner in = new Scanner(System.in);
        try {
            playerInput = in.next();
        } catch (Exception err) {
            System.out.println("...something went wrong!");
            System.out.println(err.getMessage());
        }
        return playerInput;
    }

    public static void displayOptions() {
        System.out.println("Player, please proceed");
        System.out.println("(1) Move");
        System.out.println("(2) Use item");
        System.out.println("(3) Attack");
    }


}
