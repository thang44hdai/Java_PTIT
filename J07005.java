import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class J07005 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        DataInputStream sc = new DataInputStream(new FileInputStream("DATA.IN"));
        TreeMap<Integer, Integer> mp = new TreeMap<>();
        for (int i = 0; i < 100000; i++) {
            int n = sc.readInt();
            if (mp.get(n) == null)
                mp.put(n, 1);
            else
                mp.put(n, mp.get(n) + 1);
        }
        for (int i : mp.keySet())
            System.out.println(i + " " + mp.get(i));
    }
}
