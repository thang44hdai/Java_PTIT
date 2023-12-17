import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class J07005 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        DataInputStream is = new DataInputStream(new FileInputStream("DATA.IN"));
        TreeMap<Integer, Integer> mp = new TreeMap<>();
        for (int i = 0; i < 100000; i++) {
            int x = is.readInt();
            if (mp.get(x) == null)
                mp.put(x, 1);
            else
                mp.put(x, mp.get(x) + 1);
        }
        for (int i : mp.keySet()) {
            System.out.println(i + " " + mp.get(i));
        }

    }
}
