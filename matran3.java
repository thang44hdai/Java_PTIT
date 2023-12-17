import java.util.HashMap;
import java.util.Scanner;

public class matran3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s1 = sc.nextLine().trim();
            String s2 = sc.nextLine().trim();
            String ss1[] = s1.split("\\s+");
            String ss2[] = s2.split("\\s+");
            if (ss1.length != ss2.length) {
                System.out.println("INVALID");
            } else {
                int n = ss1.length;
                float ans = 0;
                for (int i = 0; i < n; i++) {
                    int x = Integer.parseInt(ss1[i]) - Integer.parseInt(ss2[i]);
                    x = Math.abs(x);
                    ans += 1.0 * x;
                }
                System.out.printf("%.5f\n", ans);
            }
        }

    }
}
