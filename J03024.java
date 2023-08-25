import java.util.Scanner;

public class J03024 {
    public static String sol(String s) {
        int n = s.length();
        if (n % 2 == 0) {
            int cnt = 0;
            for (int i = 1; i < n; i++) {
                int x = s.charAt(i) - '0';
                if (x < 0 || x > 9)
                    return "INVALID";
                if (x % 2 == 0)
                    cnt++;
            }
            if (cnt > n - cnt)
                return "YES";
            else
                return "NO";
        } else {
            int cnt = 0;
            for (int i = 1; i < n; i++) {
                int x = s.charAt(i) - '0';
                if (x < 0 || x > 9)
                    return "INVALID";
                if (x % 2 == 1)
                    cnt++;
            }
            if (cnt > n - cnt)
                return "YES";
            else
                return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String space = sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            System.out.println(sol(s));
        }
    }
}
