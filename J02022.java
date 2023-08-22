import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

public class J02022 {
    static int n;

    static Vector<String> vt = new Vector<>();
    static boolean[] check = new boolean[15];

    public static void Try(String s) {
        if (s.length() == n) {
            System.out.println(s);
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (!check[i]) {
                if (s.length() == 0) {
                    check[i] = true;
                    Try(s + Integer.toString(i));
                    check[i] = false;
                } else {
                    int x = s.charAt(s.length() - 1) - '0';
                    if (Math.abs(x - i) != 1) {
                        check[i] = true;
                        Try(s + Integer.toString(i));
                        check[i] = false;
                    }
                }

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            for (int i = 1; i <= n; i++)
                check[i] = false;
            Try("");
        }
    }
}
