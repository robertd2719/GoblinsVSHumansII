package assets;

import gameRunner.GameRunner;
import item.Item;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public abstract class Actor extends Asset {
    private String name;
    private int health;
    private int attack;
    private int armorClass;
    private int rowPosition;
    private int columnPosition;
    private int isAlive;
    private ArrayList<Item> itemList = new ArrayList<>();

    // items are going to use this to track items
    public void useItem(Item item) {
        System.out.println();
        System.out.println(this.name + " uses " + item.getName());
        System.out.println();
        switch (item.getEffect()) {
            case LIFE: {
                switch (item.getDirection()) {
                    case INCREASE: {
                        this.setHealth(this.getHealth() + item.getValue());
                        break;
                    }
                    case DECREASE:
                        this.setHealth(this.getHealth() - item.getValue());
                        break;
                }
            }
            break;
            case ATTACK: {
                switch (item.getDirection()) {
                    case INCREASE:
                        this.setAttack(this.getAttack() + item.getValue());
                        break;
                    case DECREASE:
                        this.setAttack(this.getAttack() - item.getValue());
                        break;
                }
            }
            break;
            case ARMOR: {
                switch (item.getDirection()) {
                    case INCREASE:
                        this.setArmorClass(this.getArmorClass() + item.getValue());
                        break;
                    case DECREASE:
                        this.setArmorClass(this.getArmorClass() - item.getValue());
                        break;
                }
            }
            break;
        }
    }

    // proximity detector for items to gauge their relative distance.
    public boolean canAttack(Actor target) {
        int currentRow = this.getRowPosition();
        int currentCol = this.getColumnPosition();
        int targetRow = target.getRowPosition();
        System.out.println("Goblin " + this.getRowPosition() + " ," + this.getColumnPosition());
        System.out.println("Goblin " + this.getRowPosition() + " ," + this.getColumnPosition());
        int targetCol = target.getColumnPosition();
        if ((currentRow + 1 == targetRow) || (currentRow - 1 == targetRow)) {
            if (currentCol == targetCol) {
                System.out.println("Player Detected up/down ...can attack");
                return true;
            }
        }
        if ((currentCol + 1 == targetCol) || (currentCol - 1 == targetCol)) {
            if (currentRow == targetRow) {
                System.out.println("Player Detected left/right ...can attack");
                return true;
            }
        }
        return false;
    }

    // use this to inform the Actor where it is currently in the world
    public void setPosition(int row, int column) {
        this.setRowPosition(row);
        this.setColumnPosition(column);
    }

    // @TODO finished -- returns 'dead' player.
    public Actor attack(Actor actor) {
        // While one player's life is greater than the other
        // keep attacking the other player
        while (actor.getHealth() > 0 && this.getHealth() > 0) {
            // Phase (1) this attacks actor
            int attack = new Random().nextInt(this.getAttack()) + 1;
            int dmg = attack - actor.getArmorClass();
            // compute dmg vs. armor class to get total dmg done.
            dmg = (dmg < 0) ? 0 : dmg;
            // pause for (1) second each round
            GameRunner.pause(1);
            System.out.println(this.getName() + " attacks for: " + attack);
            System.out.println(this.getName() + " causing dmg: " + dmg);
            actor.setHealth(actor.getHealth() - dmg);
            System.out.println(actor.getName() + " health: " + actor.getHealth());
            if (actor.getHealth() <= 0) {
                System.out.println(this.getName() + " wins!");
                return actor;
            }
            System.out.println("----------");

            // Phase(2) actor attacks this.
            attack = new Random().nextInt(actor.getAttack()) + 1;
            dmg = attack - this.getArmorClass();
            // compute dmg vs. armor class to get total dmg done.
            dmg = (dmg < 0) ? 0 : dmg;
            GameRunner.pause(1);
            System.out.println(actor.getName() + " attacks for: " + attack);
            System.out.println(actor.getName() + " causing dmg: " + dmg);
            this.setHealth(this.getHealth() - dmg);
            System.out.println(this.getName() + " health: " + this.getHealth());
            if (this.getHealth() <= 0) {
                System.out.println(actor.getName() + " wins!");
                return this;
            }
            System.out.println("----------");
        }
        return null;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public int getRowPosition() {
        return rowPosition;
    }

    public void setRowPosition(int rowPosition) {
        this.rowPosition = rowPosition;
    }

    public int getColumnPosition() {
        return columnPosition;
    }

    public void setColumnPosition(int columnPosition) {
        this.columnPosition = columnPosition;
    }

    public void pickUpItem(Item item) {
        System.out.println(this.getName() + " picks up: " + item.getName());
        this.itemList.add(item);
    }

    // @TODO we may abe able to get rid of this.
    public void showInventory() {
        if (this.itemList.isEmpty()){
            System.out.println("Nothing in inventory");
            return;
        }
        System.out.println("\t\tCurrent Inventory");
        for (Item item : this.itemList) {
            System.out.println(item.getName() + " +" + item.getValue() + " " + item.getEffect());
        }
    }

    public void useItemFromInventory() {
        // If there are no items in inventory, return inventory is empty
        if (this.itemList.isEmpty()){
            System.out.println("\nThere is nothing left in your inventory");
            return;
        }
        System.out.println("\n\t------Inventory-------");
        for (int i = 0; i < this.itemList.size(); i++) {
            var size = itemList.size();
            var name = itemList.get(i).getName();
            var value = itemList.get(i).getValue();
            var effect = itemList.get(i).getEffect();
            System.out.println("\t"+ (i + 1) + " " + name + " +" + value + " " + effect);
        }
        System.out.println("\n Which item would you like to use (1-" + itemList.size() + ")");
        var scanner = new Scanner(System.in);
        try{
            var input = scanner.nextInt();
            var item = this.itemList.get(input-1);
            this.useItem(item);
            this.itemList.remove(input-1);
        } catch(Exception err){
            System.out.println("Sorry, something went wrong");
            System.out.println(err.getMessage());
        }
    }

    public int getIsAlive() {
        return isAlive;
    }
}
