import java.util.*;

public abstract class Check {

    private static List<Integer> win = new ArrayList<Integer>();

    public static boolean checkResult(List list) {

        win.add(4);
        win.add(2);
        win.add(1);

        return (list.containsAll(win));
    }
}
