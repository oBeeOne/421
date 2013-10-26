import java.util.*;

public class Round {

    private List<Dice> dices = new ArrayList<Dice>();
    private final int NUM_DICES = 3;

    public Round() {

        for (int i=0; i < NUM_DICES; i++) {
            Dice d = new Dice();
            dices.add(d);
        }
    }

    public List playRound() {
        List<Integer> retval = new ArrayList<Integer>();
        for (Dice d : dices) {
            retval.add(d.getFaceVal());
        }

        return retval;
    }
}
