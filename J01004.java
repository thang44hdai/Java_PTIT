import java.util.Scanner;
import java.lang.Math;

public class J01004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            System.out.println(check(n));
        }
    }

    public static String check(long n) {
        if (n <= 1)
            return "NO";
        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return "NO";
            }
        }
        return "YES";
    }
}
