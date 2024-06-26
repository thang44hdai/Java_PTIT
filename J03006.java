import java.util.Scanner;

public class J03006 {
    public static String sol(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            int x = s.charAt(l) - '0';
            int y = s.charAt(r) - '0';
            if (x % 2 == 1 || y % 2 == 1 || x != y)
                return "NO";
            l++;
            r--;
        }
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
