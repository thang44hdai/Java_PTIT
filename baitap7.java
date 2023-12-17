import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

class gv {
    String id, name;

    gv(String s, String y) {
        this.id = s;
        this.name = y;
    }

    public String toString() {
        return this.id + " " + this.name;
    }
}

public class baitap7 {
    public static void main(String[] args) throws FileNotFoundException, FileNotFoundException {
        Scanner sc = new Scanner(new File("INSTITUTION.in"));
        int n = sc.nextInt();
        TreeMap<String, String> mp = new TreeMap<>();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] k = s.split(" ");
            String ans = "";
            for (int j = 1; j < k.length; j++)
                ans += k[j] + " ";
            mp.put(k[0], ans);
            System.out.println(ans);
        }

        ArrayList<gv> vt = new ArrayList<>();
        Scanner sc1 = new Scanner(new File("REGISTER.in"));
        int n1 = sc1.nextInt();
        sc1.nextLine();
        for (int i = 0; i < n1; i++) {
            String p = sc1.nextLine();
            String s[] = p.split(" ");
            int n2 = Integer.parseInt(s[1]);
            while (n2-- > 0) {
                String q = sc1.nextLine();
                vt.add(new gv(q, mp.get(s[0])));
            }
        }
        Collections.sort(vt, new Comparator<gv>() {
            @Override
            public int compare(gv o1, gv o2) {
                if (o1.name.compareTo(o2.name) != 0)
                    return o1.name.compareTo(o2.name);
                return o1.id.compareTo(o2.id);
            }
        });
        for (int i = 0; i < vt.size(); i++) {
            if (i < 10)
                System.out.print("team0" + Integer.toString(i+1) + " ");
            else
                System.out.print("team" + Integer.toString(i+1) + " ");
            System.out.println(vt.get(i));
        }
    }
}
