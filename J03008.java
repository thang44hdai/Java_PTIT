import java.util.Scanner;

public class J03008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String space = sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            System.out.println(sol(s));
        }
    }

    private static boolean snt(char s) {
        if (s != '2' && s != '3' && s != '5' && s != '7')
            return false;
        return true;
    }

    private static String sol(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r) || snt(s.charAt(l)) == false || snt(s.charAt(r)) == false)
                return "NO";
            l++;
            r--;
        }
        return "YES";
    }

}
