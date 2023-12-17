import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class J07015 {
    static int prime[] = new int[1000001];

    public static void sang() {
        for (int i = 0; i <= 1000000; i++)
            prime[i] = 1;
        prime[0] = prime[1] = 0;
        for (int i = 2; i <= 1000; i++)
            if (prime[i] == 1)
                for (int j = i * i; j <= 1000000; j += i)
                    prime[j] = 0;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        sang();
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) sc.readObject();
        TreeMap<Integer, Integer> mp = new TreeMap<>();
        for (int i : a) {
            if (prime[i] == 1) {
                if (mp.get(i) == null)
                    mp.put(i, 1);
                else
                    mp.put(i, mp.get(i) + 1);
            }
        }
        for (int i : mp.keySet())
            System.out.println(i + " " + mp.get(i));

    }
}
