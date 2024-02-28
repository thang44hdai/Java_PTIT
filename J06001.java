import java.util.Scanner;
import java.util.Vector;

class sp {
    String maloai;
    String ten;
    float dongia1, dongia2;

    sp(String x, String y, float a, float b) {
        this.maloai = x;
        this.ten = y;
        this.dongia1 = a;
        this.dongia2 = b;
    }
}

class hoadon {
    String maloai;
    String id;
    String ten;
    String mahoadon;
    int loai;
    int soluong;
    float tra;
    float giamgia;

    hoadon(int id, String a, int b) {
        this.mahoadon = a;
        this.soluong = b;
        this.id = a + "-" + String.format("%03d", id);
        String maloai = a.substring(0, 2);
        this.maloai = maloai;
        this.loai = Integer.parseInt(a.substring(2));
    }

    public String toString() {
        return this.id + " " + this.ten + " " + (int) this.giamgia + " " + (int) this.tra;
    }

}

public class J06001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Vector<sp> vt1 = new Vector<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            vt1.add(new sp(sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat()));
        }
        Vector<hoadon> vt2 = new Vector<>();
        int m = sc.nextInt();
        for (int i = 1; i <= m; i++) {
            sc.nextLine();
            String x = sc.next();
            int y = sc.nextInt();
            String a = x.substring(0, 2);
            String b = x.substring(2);
            for (sp j : vt1) {
                if (j.maloai.equals(a)) {
                    hoadon z = new hoadon(i, x, y);
                    if (b.equals("1")) {
                        z.tra = y * j.dongia1;
                    } else
                        z.tra = y * j.dongia2;
                    z.ten = j.ten;
                    if (y >= 150)
                        z.giamgia = (float) (0.5 * z.tra);
                    else if (y >= 100)
                        z.giamgia = (float) 0.3 * z.tra;
                    else if (y >= 50)
                        z.giamgia = (float) 0.15 * z.tra;
                    else
                        z.giamgia = 0;
                    z.tra -= z.giamgia;
                    vt2.add(z);
                    break;
                }
            }

        }
        for (hoadon i : vt2)
            System.out.println(i);

    }
}
