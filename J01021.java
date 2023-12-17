import java.util.Scanner;

public class J01021 {
    static long m = (long) (1e9 + 7);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            if (x == 0 && y == 0)
                break;
            System.out.println(Pow(x, y));
        }
    }

    private static long Pow(long x, long y) {
        if (y == 0)
            return 1;
        if (y == 1)
            return x;
        long tmp = Pow(x, y / 2) % m;
        if (y % 2 == 0)
            return (tmp * tmp) % m;
        else
            return ((tmp * tmp) % m * x) % m;
    }

}
