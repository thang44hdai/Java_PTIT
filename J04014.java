import java.util.Scanner;

class phanSo {
    long x, y;

    phanSo(long x, long y) {
        this.x = x;
        this.y = y;
    }

    long gcd(long x, long y) {
        while (y != 0) {
            long tmp = x % y;
            x = y;
            y = tmp;
        }
        return x;
    }

    public phanSo add(phanSo a) {
        long ts = this.x * a.y + this.y * a.x;
        long ms = this.y * a.y;
        long uc = gcd(ts, ms);
        return new phanSo(ts / uc, ms / uc);
    }

    public phanSo mutil(phanSo a) {
        long ts = this.x * a.x;
        long ms = this.y * a.y;
        long uc = gcd(ts, ms);
        return new phanSo(ts / uc, ms / uc);
    }
}

public class J04014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            phanSo a = new phanSo(sc.nextLong(), sc.nextLong());
            phanSo b = new phanSo(sc.nextLong(), sc.nextLong());
            phanSo c = a;
            c = c.add(b);
            c.x *= c.x;
            c.y *= c.y;
            System.out.print(c.x + "/" + c.y + " ");
            phanSo d = c.mutil(a.mutil(b));
            System.out.println(d.x + "/" + d.y);

        }
    }
}
