import java.util.*;
import java.io.*;

// xau doi xung
public class baitap3 {
    public static boolean check(String s) {
        if (s.length() % 2 == 0)
            return false;
        for (int i = 0; i <= s.length() / 2; i++) {
            char a = s.charAt(i);
            char b = s.charAt(s.length() - i - 1);
            if (Character.isDigit(a) || Character.isDigit(b))
                return false;
            if (a != b)
                return false;
        }
        return true;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine().toUpperCase();
            if (check(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}