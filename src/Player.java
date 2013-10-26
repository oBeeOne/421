
public class Player {

    private int score;
    private String name;

    public Player() {
        score = 0;
        name = "Unknown";
    }

    public String getName() {
        return name;
    }

    public void setName() {
        name = UserInput.getText("Nom du joueur ?");
    }

    public int getScore() {
        return score;
    }

    public int updateScore(int value) {
        score += value;
        return score;
    }

    public boolean win() {
        return (score == 5);
    }
}
