import java.io.*;

public abstract class UserInput {

    /* Declaration des variables */
    private static String text;

    /* Initialisation */
    public UserInput() {
        text = "";
    }

    /* Renvoie la saisie clavier de l'utilisateur */
    public static String getText(String q) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print(q);
            text = br.readLine();
        }catch (IOException e){
            System.err.println("Mauvais format !");
        }

        return text;
    }
}
