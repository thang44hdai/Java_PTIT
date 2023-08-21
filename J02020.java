import java.util.Scanner;
import java.util.Vector;

public class J02020 {
    static int cnt = 0;
    static Vector<Integer> vt = new Vector<Integer>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Try(1, n, k);
        System.out.println("Tong cong co " + cnt + " to hop");
    }

    public static void Try(int i, int n, int k) {
        if (vt.size() == k) {
            cnt++;
            for (int integer : vt) {
                System.out.print(integer + " ");   
            }
            System.out.println();
            return;
        }
        for (int j = i; j <= n; j++) {
            vt.add(j);
            Try(j + 1, n, k);
            vt.remove(vt.size() - 1);

        }
    }
}
