import java.util.*;

class sv {
    String name;
    String lop;
    String id;
    float a, b, c;

    sv(String x, String y, String z, float a, float b, float c) {
        this.id = x;
        this.name = y;
        this.lop = z;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String toString() {
        return this.id + " " + this.name + " " + this.lop + " " + String.format("%.1f %.1f %.1f", a, b, c);
    }
}

public class J05030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sv a[] = new sv[n];
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            a[i] = new sv(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
        }
        Arrays.sort(a, 0, n, new Comparator<sv>() {
            public int compare(sv a, sv b) {
                return a.id.compareTo(b.id);
            }
        });
        for (int i = 0; i < n; i++) {
            System.out.print(i + 1 + " ");
            System.out.println(a[i]);
        }

    }
}
