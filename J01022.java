import java.util.Scanner;

public class J01022 {
    static long[] f = new long[94];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        f[1] = f[2] = 1;
        for (int i = 3; i < 94; i++)
            f[i] = f[i - 1] + f[i - 2];
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(sol(n, k));
        }
    }

    private static long sol(int n, long k) {
        if (n == 1)
            return 0;
        if (n == 2)
            return 1;
        if (k > f[n - 2])
            return sol(n - 1, k - f[n - 2]);
        else
            return sol(n - 2, k);
    }

}
