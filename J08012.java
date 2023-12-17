import java.util.Scanner;
import java.util.Vector;

public class J08012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Vector<Integer> vt[] = new Vector[n + 1];
        for (int i = 1; i <= n; i++)
            vt[i] = new Vector<>();
        for (int i = 1; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            vt[x].add(y);
            vt[y].add(x);
        }
        int check1 = 0, check2 = 0;
        for (int i = 1; i <= n; i++)
            if (vt[i].size() == 1)
                check1++;
            else if (vt[i].size() == n - 1)
                check2++;
        if (check2 == 1 && check1 == n - 1)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
