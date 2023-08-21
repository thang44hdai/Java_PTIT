import java.util.Scanner;

public class J02008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long ans = 1;
            for (long i = 2; i <= n; i++)
                ans = ans * i / gcd(ans, i);
            System.out.println(ans);
        }
    }

    public static long gcd(long x, long y) {
        while (y != 0) {
            long tmp = x % y;
            x = y;
            y = tmp;
        }
        return x;
    }
}
