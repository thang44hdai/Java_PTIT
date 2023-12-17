import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class baitap8 {
    static int prime[] = new int[1000001];

    public static int check(int n) {
        String s = Integer.toString(n);
        if (s.length() < 3)
            return 0;
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r))
                return 0;
            l++;
            r--;
        }
        return 1;

    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) sc.readObject();
        TreeSet<Integer> st = new TreeSet<>();
        for (int i : a) {
            if (check(i) == 1)
                st.add(i);
        }
        for (int i : st)
            System.out.println(i);

    }
}
