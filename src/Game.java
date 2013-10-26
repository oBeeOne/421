import java.util.*;
import static java.lang.System.*;

public class Game {

    private List<Player> players = new ArrayList<Player>();
    private final int NUM_PLAYERS = 3;

    public Game() {

        for (int i=0; i<NUM_PLAYERS; i++) {
            Player p = new Player();
            p.setName();
            players.add(p);
        }
    }

    public void playGame() {
        List<String> winners = new ArrayList<String>();

        while (winners.isEmpty()) {
            for (Player p : players) {

                List result = new Round().playRound();
                out.println(p.getName()+" Lance les dés...");
                out.println("Résultat : "+result.get(0)+result.get(1)+result.get(2));
                if (Check.checkResult(result)) {
                    out.println(p.getName()+" marque un point !");
                    p.updateScore(1);
                }

                if (p.win()) {
                    winners.add(p.getName());
                }
            }
        }

        if (!winners.isEmpty()) {
            out.println("Il y a " + winners.size() + " gagnant(s) :");
            for (String winner : winners) {
                out.println(winner);
            }

            out.println("Sores :");
            for (Player p : players) {

                out.println(p.getName()+" : "+p.getScore());
            }
        }
    }
}
