import java.util.Scanner;

public class J01024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String space = sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            System.out.println(sol(s));
        }
    }

    private static String sol(String s) {
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int x = s.charAt(i)-'0';
            if (x != 0 && x != 1 && x != 2)
                return "NO";
        }
        return "YES";
    }
}
