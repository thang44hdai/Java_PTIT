import java.util.Scanner;

public class J03007 {
    public static String sol(String s) {
        int n = s.length();
        if (s.charAt(0) != '8' || s.charAt(n - 1) != '8')
            return "NO";
        int l = 0, r = n - 1, sum = 0;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r))
                return "NO";
            sum += s.charAt(l) - '0' + s.charAt(r) - '0';
            l++;
            r--;
        }
        if (sum % 10 == 0)
            return "YES";
        return "NO";
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
