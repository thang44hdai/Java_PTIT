import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class J07029 {
    static int prime[] = new int[1000005];

    static void init() {
        prime[0] = prime[1] = 1;
        for (int i = 2; i <= 1000; i++)
            if (prime[i] == 0) {
                for (int j = i * i; j <= 1000000; j += i) {
                    prime[j] = 1;
                }
            }
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        init();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) ois.readObject();
        TreeMap<Integer, Integer> mp = new TreeMap<>();
        for (Integer i : a) {
            if (prime[i] == 0) {
                if (mp.get(i) != null) {
                    mp.put(i, mp.get(i) + 1);

                } else
                    mp.put(i, 1);
            }
        }
        for (int i = 0; i < 10; i++) {
            int j = mp.lastKey();
            System.out.printf("%d %d\n", j, mp.get(j));
            mp.remove(j);
        }

    }
}
