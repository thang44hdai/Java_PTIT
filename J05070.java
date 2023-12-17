import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

class clb {
    String id, name;
    int gv;
    String matran;

    clb(String a, String b, int c) {
        this.id = a;
        this.name = b;
        this.gv = c;
    }

    public String toString() {
        return this.matran + " " + this.name + " " + this.gv;
    }
}

public class J05070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        clb a[] = new clb[n];
        HashMap<String, clb> mp = new HashMap();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            a[i] = new clb(sc.nextLine(), sc.nextLine(), sc.nextInt());
            mp.put(a[i].id, a[i]);
        }

        n = sc.nextInt();
        while (n-- > 0) {
            sc.nextLine();
            String s = sc.next();
            int k = sc.nextInt();
            String id = s.substring(1, 3);
            mp.get(id).matran = s;
            mp.get(id).gv *= k;
        }
        Arrays.sort(a, new Comparator<clb>() {
            @Override
            public int compare(clb o1, clb o2) {
                if (o1.gv != o2.gv)
                    return -1 * (o1.gv - o2.gv);
                return o1.name.compareTo(o2.name);
            }
        });
        for (clb i : a)
            System.out.println(i);
    }
}
