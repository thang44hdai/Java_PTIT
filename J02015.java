import java.util.*;

public class J02015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
        Vector<Integer> vt[] = new Vector[n + 1];
        for (int i = 1; i <= n; i++)
            vt[i] = new Vector<Integer>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 1) {
                    vt[i + 1].add(j + 1);
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.printf("List(%d) = ", i);
            for (int j : vt[i])
                System.out.print(j + " ");
            System.out.println();
        }
    }
}
