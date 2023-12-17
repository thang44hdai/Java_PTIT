import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class J07004 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        TreeMap<Integer, Integer> mp = new TreeMap<>();
        while (sc.hasNextInt()) {
            int x = sc.nextInt();
            if (mp.containsKey(x)) {
                mp.put(x, mp.get(x) + 1);
            } else {
                mp.put(x, 1);
            }
        }
        for (int i : mp.keySet()) {
            System.out.printf("%d %d\n", i, mp.get(i));
        }
    }
}
