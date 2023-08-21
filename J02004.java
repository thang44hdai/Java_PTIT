import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J02004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]= sc.nextInt();
            }
            System.out.println(sol(a, n));
        }
    }

    public static String sol(int[] a, int n) {
        int l = 0;
        int r = n - 1;
        while (l < r) {
            if (a[l++] != a[r--])
                return "NO";
        }
        return "YES";
    }
}