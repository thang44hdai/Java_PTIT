import java.util.Scanner;
import java.util.*;

public class J03008 {
    private static int nt(char c) {
        if (c == '2' || c == '3' || c == '5' || c == '7')
            return 1;
        return 0;
    }

    private static String sol(String n) {
        int l = 0, r = n.length() - 1;
        while (l < r) {
            if (n.charAt(l) != n.charAt(r) || nt(n.charAt(l)) == 0 || nt(n.charAt(r)) == 0)
                return "NO";
            l++;
            r--;
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String n = sc.nextLine();
            System.out.println(sol(n));
        }
    }
}
