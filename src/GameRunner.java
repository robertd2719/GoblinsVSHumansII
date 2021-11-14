import assets.Actor;
import assets.Goblin;
import assets.Human;
import board.GameBoard;
import item.HealthPotion;
import item.Sword;

import java.util.Scanner;

public class GameRunner {
    public static void main(String[] args) {
//        MainLoop();
        GameBoard board = new GameBoard(15, 20);
        Human human = new Human();
        Goblin goblin = new Goblin();
        board.placeActor(human, 1, 1);
        board.placeActor(goblin, 5, 5);
        human.pickUpItem(new HealthPotion());
        human.pickUpItem(new Sword());
        human.pickUpItem(new HealthPotion());
        tesStats(human);
        human.useItemFromInventory();
        tesStats(human);

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
        /*
            The game-loop will consist of the following
            1. The player will be given a list of options
                - Move
                    Query move direction; if the direction is legal move human (1) space
                    in that direction. If not re-set to move direction.
                - Use item
                    The player will be given a list of available items in their inventory
                    and given the option to use the item. In this iteration all items
                    are permanently removed and consumed by the player to effect a relevant
                    statistic.
                - Attack
                    If the player is within range of the opponent, they will be able to attack.
         */
        while (true) {
            displayOptions();
            var reply = getPlayerInput();
            System.out.println("player chose: " + reply);
            if (Integer.parseInt(reply) == 1) {
                playerMoveSelection();
                reply = getPlayerInput();
                var direction = Integer.parseInt(reply);
                switch (direction) {
                    case 1:
                        board.moveItemUp(human, 1);
                        break;
                    case 2:
                        board.moveItemRight(human, 1);
                        break;
                    case 3:
                        board.moveItemDown(human, 1);
                        break;
                    case 4:
                        board.moveItemLeft(human, 1);
                        break;
                }
                board.displayBoard();
                continue;

            }
            // Player can select from a range of items.
            if (Integer.parseInt(reply) == 2) {
                System.out.println("What item would you like to use: ");
                // @TODO list inventory here and implement a procuedure to remove items.
                reply = getPlayerInput();
                System.out.println(reply);
            }

            // IF legal the player
            if (Integer.parseInt(reply) == 3) {
                System.out.println("Please enter new selection");
                reply = getPlayerInput();
                System.out.println(reply);
            }
        }
    }

    public static void playerMoveSelection(){
        System.out.println("What direction would you like to move?:");
        System.out.println("1. Up");
        System.out.println("2. Right");
        System.out.println("3. Down");
        System.out.println("4. Right");
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
