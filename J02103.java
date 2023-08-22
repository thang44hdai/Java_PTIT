import java.util.Scanner;

public class J02103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int T = 1; T <= t; T++) {
            System.out.println("Test " + T + ":");
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a[][] = new int[n][m];
            int b[][] = new int[m][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < m; j++) {
                    a[i][j] = sc.nextInt();
                    b[j][i] = a[i][j];
                }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int sum = 0;
                    for (int k = 0; k < m; k++) {
                        sum += a[i][k] * b[k][j];
                    }
                    System.out.print(sum + " ");
                }
                System.out.println();
            }

        }
    }
}
