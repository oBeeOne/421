
public class Dice {

    private int faceVal;
    private final int MAX_FACES;

    public Dice() {
        faceVal = 1;
        MAX_FACES = 6;
    }

    public int getFaceVal() {
        faceVal = (int) ((Math.random()*MAX_FACES)+1);
        return faceVal;
    }
}
