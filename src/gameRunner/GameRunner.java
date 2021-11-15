package gameRunner;

import assets.Actor;
import assets.Chest;
import assets.Goblin;
import assets.Human;
import board.GameBoard;
import item.LifeRing;
import item.Shield;
import item.Sword;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GameRunner {
    public static void main(String[] args) {
        // create the player and give them some items to use along their adventure
        Human human = new Human();
        welcomeBanner();
        human.pickUpItem(new LifeRing());
        human.pickUpItem(new Sword());
        human.pickUpItem(new Shield());
        human = (Human) runStageOne(human);
        // check for state of human to see if it is still alive
        if (human.getHealth() <= 0) {
            // Human did not survive
            endGameSequence(human, END_GAME.LOSE);
        } else {
            System.out.println("Current Score: "+human.getScore());
            human = (Human) runBossStage(human);
            // Did player survive the boss battle?
            if (human.getHealth() <= 0) {
                endGameSequence(human, END_GAME.LOSE);
            } else {
                endGameSequence(human, END_GAME.WIN);
            }
        }
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

    public static Actor runStageOne(Human human) {
        GameBoard board = new GameBoard(15, 20);
        human = (Human) MainLoop(human, board);

        return human;
    }

    public static Actor runBossStage(Human human) {
        GameBoard board2 = new GameBoard(15, 29);
        human = (Human) MainLoop(human, board2);

        return human;
    }

    public static Actor MainLoop(Human human, GameBoard board) {
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
                    var lootChest = new Chest();
                    board.placeItem(lootChest, goblin.getRowPosition(), goblin.getColumnPosition());
                    // Spawn a random chest on the board.
                    // populate the chest with a random item
                    System.out.println("\n\t\tCongratulations you have defeated the goblin");
                    System.out.println("\t\tAnd found a chest containing a " + lootChest.getItem().getName() + "!!!");
                    human.pickUpItem(lootChest.getItem());
                    board.displayBoard();
                    human.setScore(human.getScore() + 15);
                    pause(5);
                    System.out.println("\t\t**************************************");
                    System.out.println("\t\t......Moving on to next stage.........");
                    return human;
                    // if player wins; they will proceed to the next map.
                    // if this is the last encounter, player wins.
                    // @ return human to set up the next encounter
                    // @****maybe check to see if high score!!!!********

                }
                if (human.getHealth() <= 0) {
                    System.out.println("\t\tYou were defeated!!!!");
                    System.out.println("\t\tPlayer Score: " + human.getScore());
                    return human;
                }
                board.displayBoard();
                continue;

            }
            // Player can select from a range of items.
            if (Integer.parseInt(reply) == 2) {
                human.useItemFromInventory();
                continue;
            }

            // Allow the player to view their statistics
            if (Integer.parseInt(reply) == 3) {
                tesStats(human);
                System.out.println();
                pause(2);
            }
        }
    }

    public static void playerMoveSelection() {
        System.out.println("\t" +
                "What direction would you like to move?:");
        System.out.println();
        System.out.println("\t\t\t1. Up");
        System.out.println("\t\t\t2. Right");
        System.out.println("\t\t\t3. Down");
        System.out.println("\t\t\t4. Left");
        System.out.println();
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
        System.out.println("\t\tPlayer, please proceed");
        System.out.println();
        System.out.println("\t\t\t(1) Move");
        System.out.println("\t\t\t(2) Use item");
        System.out.println("\t\t\t(3) List Player Stats");
        System.out.println();
    }

    public static void welcomeBanner() {
        System.out.println("--------------------------------");
        System.out.println("Welcome to Humans vs. Goblins II");
        System.out.println("--------------------------------");
    }

    // Game over, end sequence...update player score and place
    // score into the high scorer category if it does not exist.
    public static void endGameSequence(Human human, END_GAME status) {

        switch (status) {
            case WIN: {
                System.out.println("\n\tCONGRATULATIONS WINNER!!");
                System.out.println("\n\tPlayer Score: " + human.getScore());
                readWriteHighScores(human);
                break;
            }
            case LOSE: {
                System.out.println("\n\tSorry Please try again!!!");
                System.out.println("\n\tPlayer Score: " + human.getScore());
                readWriteHighScores(human);
                break;
            }
        }
        System.out.println("\t---------Game Over-----------");
    }

    public static void readWriteHighScores(Human human) {
        // attempt to open a file if one exists
        Path path = Paths.get("src/resources/high_score.txt");

        createFile(path);
        writeFile(path, human);
        List<String> outArray = readFile(path);
        var outArray2 = outArray.stream().map(e -> Stream.of(e.split(" ")).collect(Collectors.toList()))
                .collect(Collectors.toCollection(ArrayList::new));
        outArray2.stream().sorted((a, b) -> Integer.parseInt(b.get(1)) - Integer.parseInt(a.get(1))).forEach(e -> System.out.print("\t" + e + "\n"));
    }

    // If the file does not exist we will attempt to create it here
    public static void createFile(Path path) {
        if (Files.exists(path)) {
            System.out.println("High Score file exists");
        } else {
            try {
                Files.createFile(path);
                System.out.println("high_score file was created!!!");
            } catch (Exception err) {
                System.out.println("Unable to ope file");
                System.out.println(err.getMessage());
            }
        }
    }

    // Here we will write to the file itself
    public static void writeFile(Path path, Human human) {
        Scanner in = new Scanner(System.in);
        System.out.print(" -- Pleas enter player name: ");
        var name = in.next();

        var score = human.getScore();
        try {
            Files.writeString(path, name + " " + score + "\n", StandardOpenOption.APPEND);
        } catch (IOException err) {
            System.out.println(err.getMessage());
            System.out.println("Unable to write to file");
        }
    }

    // Read information from a file and output to a List
    public static List readFile(Path path) {
        try {
            var input = Files.readAllLines(path);
            return input;
        } catch (IOException err) {
            System.out.println(err.getMessage());
            System.out.println("Unable to read file");
        }
        return null;
    }

    // pause for effect
    public static void pause(int secs) {
        try {
            TimeUnit.SECONDS.sleep(secs);
        } catch (Exception err) {
            System.out.println(err.getMessage());
            System.out.println("Unable to pause");
        }
    }

    //
    public static void centerPrint(String str) {

    }
}

enum END_GAME {
    WIN, LOSE
}
