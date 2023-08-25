import java.util.Scanner;

public class J03021 {
    public static String sol(String s) {
        int n = s.length();
        int l = 0, r = n - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r))
                return "NO";
            l++;
            r--;
        }
        return "YES";
    }

    public static String change(char x) {
        x = Character.toUpperCase(x);
        switch (x) {
            case 'A':
            case 'B':
            case 'C':
                return "2";
            case 'D':
            case 'E':
            case 'F':
                return "3";
            case 'G':
            case 'H':
            case 'I':
                return "4";
            case 'J':
            case 'K':
            case 'L':
                return "5";
            case 'M':
            case 'N':
            case 'O':
                return "6";
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
                return "7";
            case 'T':
            case 'U':
            case 'V':
                return "8";
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                return "9";
        }
        return "";

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String space = sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            int n = s.length();
            String sol = "";
            for (int i = 0; i < n; i++) {
                sol += change(s.charAt(i));
            }
            System.out.println(sol(sol));
        }
    }
}
