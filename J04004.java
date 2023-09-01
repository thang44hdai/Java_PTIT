import java.util.*;

class phanSo {
    private long ts;
    private long ms;

    phanSo(long x, long y) {
        long uc = gcd(x, y);
        this.ts = x / uc;
        this.ms = y / uc;
    }

    public phanSo add(phanSo x) {
        long ts1 = this.ts * x.ms + this.ms * x.ts;
        long ms1 = this.ms * x.ms;
        long uc = gcd(ts1, ms1);
        return new phanSo(ts1/uc, ms1/uc);
    
    }

    long gcd(long a, long b) {
        while (b != 0) {
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public String toString() {
        return String.valueOf(this.ts) + "/" + String.valueOf(this.ms);
    }

}

public class J04004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        phanSo p = new phanSo(sc.nextLong(), sc.nextLong());
        phanSo q = new phanSo(sc.nextLong(), sc.nextLong());
        System.out.println(p.add(q));
    }
}
