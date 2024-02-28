import java.util.Scanner;
import java.util.Vector;

class clb {
    String kh;
    String matran;
    String tendoi;
    long doanhthu;
    long giave;

    clb(String id, String name, long giave) {
        this.kh = id;
        this.tendoi = name;
        this.giave = giave;
    }

    public String toString() {
        return this.matran + " " + this.tendoi + " " + this.doanhthu;
    }
}

public class J05069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Vector<clb> vt = new Vector<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            vt.add(new clb(sc.nextLine().trim(), sc.nextLine().trim(), sc.nextLong()));
        }
        int m = sc.nextInt();
        for (int j = 0; j < m; j++) {
            sc.nextLine();
            String id = sc.next();
            String id2 = id.substring(1, 3);
            long q = sc.nextLong();
            for (clb i : vt) {
                if (i.kh.equals(id2)) {
                    i.doanhthu = i.giave * q;
                    i.matran = id;
                    break;
                }
            }
        }
        for (clb i : vt)
            System.out.println(i);

    }
}
