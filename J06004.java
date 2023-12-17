import java.util.*;

class sv {
    String name;
    String id;
    String sdt;
    int stt;
    String baitap;

    sv(String x, String y, String z, int t) {
        this.name = y;
        this.id = x;
        this.sdt = z;
        this.stt = t;
    };

    public String toString() {
        return this.id + " " + this.name + " " + this.sdt + " " + this.stt + " " + this.baitap;
    }
}

public class J06004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Vector<sv> vt = new Vector<>();

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            sv a = new sv(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt());
            vt.add(a);
        }
        sc.nextLine();
        for (int i = 1; i <= m; i++) {
            String x = sc.nextLine();
            for (sv a : vt)
                if (a.stt == i)
                    a.baitap = x;
        }
        Collections.sort(vt, new Comparator<sv>() {

            @Override
            public int compare(sv o1, sv o2) {
                if (o1.id.compareTo(o2.id) != 0)
                    return o1.id.compareTo(o2.id);
                if (o1.stt != o2.stt)
                    return (o1.stt < o2.stt) ? -1 : 1;
                return o1.baitap.compareTo(o2.baitap);
            }

        });
        for(sv i: vt)
            System.out.println(i);

    }
}
