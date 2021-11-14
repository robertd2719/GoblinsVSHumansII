import assets.Actor;
import assets.Chest;
import assets.Goblin;
import assets.Human;
import board.GameBoard;
import item.LifeRing;
import item.Shield;
import item.Sword;

import java.util.Scanner;

public class GameRunner {
    public static void main(String[] args) {
        // create the player and give them some items to use along their adventure
        Human human = new Human();
        human.pickUpItem(new LifeRing());
        human.pickUpItem(new Sword());
        human.pickUpItem(new Shield());
        human = runStageOne(human);
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

    public static Human runStageOne(Human human){
        GameBoard board = new GameBoard(15, 20);
        MainLoop(human, board);

        // @TODO change below to reflect actual human that is being returned.
        return new Human();
    }

    public static void MainLoop(Human human, GameBoard board) {
        Goblin goblin = new Goblin();
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
                board.displayBoard();
                playerMoveSelection();
                reply = getPlayerInput();
                var direction = Integer.parseInt(reply);
                // @TODO after each player move check permission for attack state with main game.
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
                board.trackEnemy(goblin, human);
                board.displayBoard();
                if (goblin.getHealth() <= 0) {
                    board.removeItem(goblin);
                    // Spawn a random chest on the board.
                    // populate the chest with a random item
                    System.out.println("Congratulations you have found a chest");
                    board.placeItem(new Chest(), 5, 5);
                    // @TODO  player to proceed to next map
                    // @TODO return human and begin next encounter sequence
                    // @TODO if this is last iteration, player wins
                    // @****maybe check to see if high score!!!!********

                }
                board.displayBoard();
                continue;

            }
            // Player can select from a range of items.
            if (Integer.parseInt(reply) == 2) {
               human.useItemFromInventory();
                continue;
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

    public static void welcomeBanner() {
        System.out.println("--------------------------------");
        System.out.println("Welcome to Humans vs. Goblins II");
        System.out.println("--------------------------------");
    }


}
