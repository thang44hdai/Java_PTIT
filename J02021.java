import java.util.Scanner;
import java.util.Vector;

public class J02021 {
    static int n, k;
    static Vector<String> vt = new Vector<String>();

    public static void Try(String s, int i) {
        if (s.length() == k) {
            vt.add(s);
            return;
        }
        for (int j = i; j <= n; j++) {
            Try(s + Integer.toString(j), j + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        Try("", 1);
        for (String i : vt) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Tong cong co " + vt.size() + " to hop");
    }
}
