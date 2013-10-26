import java.util.*;

public abstract class Check {

    public static boolean checkResult(List list) {
        return (list.contains(4) && list.contains(2) && list.contains(1));
        // return (list.containsAll()); à voir pourquoi ne fonctionne pas
    }
}
