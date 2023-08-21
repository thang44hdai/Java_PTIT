import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        mp.put(1,  1);
        mp.put(2, 1);
        int x = mp.get(1);
        x++;
        mp.put(1, x);
        Set<Integer> st= mp.keySet();
        for (int a : st) {
            System.out.println(mp.get(a));
        }

    }
}