import java.util.*;

class sv {
    String name;
    String id;
    String sdt;
    int stt;

    sv(String x, String y, String z, int t) {
        this.name = y;
        this.id = x;
        this.sdt = z;
        this.stt = t;
    };

    public String toString() {
        return this.id + " " + this.name + " " + this.sdt;
    }
}

public class J06003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Vector<sv> vt[] = new Vector[m + 1];
        String chu_de[] = new String[m + 1];
        for (int i = 1; i <= m; i++) {
            vt[i] = new Vector<>();
        }

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            sv a = new sv(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt());
            vt[a.stt].add(a);
        }
        sc.nextLine();
        for (int i = 1; i <= m; i++) {
            chu_de[i] = sc.nextLine();

        }
        int q = sc.nextInt();
        while(q-->0){
            int t = sc.nextInt();
            System.out.printf("DANH SACH NHOM %d:\n", t);
            for(sv i: vt[t])
                System.out.println(i);
            System.out.printf("Bai tap dang ky: %s\n", chu_de[t]);

        }

    }
}
