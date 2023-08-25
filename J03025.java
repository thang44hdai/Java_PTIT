import java.util.Scanner;

public class J03025 {
    public static String sol(String s) {
        int n = s.length();
        int l = 0, r = n - 1;
        int cnt = 0;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r))
                cnt++;
            if (cnt > 1)
                return "NO";
            l++;
            r--;
        }
        if (cnt == 0 && n % 2 == 0)
            return "NO";
        return "YES";
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
