import java.util.Scanner;

public class J01021 {
    static int m = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            long x = sc.nextInt();
            long y = sc.nextInt();
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
