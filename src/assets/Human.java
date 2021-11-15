package assets;

public class Human extends Actor {
    int score;

    public Human() {
//        System.out.println("New Human Created");
        this.setName("Human");
        this.setAttack(10);  // base attack
        this.setHealth(100); // base health
        this.setArmorClass(0);
        this.setScore(0);
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "\uD83D\uDC73";
    }
}
