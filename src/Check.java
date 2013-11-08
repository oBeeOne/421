import java.util.*;

public abstract class Check {

    private static List<Integer> win = new ArrayList<Integer>();

    public Check() {
        win.add(4);
        win.add(2);
        win.add(1);
    }

    public static boolean checkResult(List list) {
       return (list.containsAll(win));
    }
}
