import java.util.Scanner;

class Matrix {
    int n, m;
    int a[][];

    Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        a = new int[n][m];
    }

    public void nextMatrix(Scanner sc) {
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                a[i][j] = sc.nextInt();
    }

    public Matrix mul(Matrix b) {
        Matrix c = new Matrix(n, b.m);
        for (int i = 0; i < n; i++)
            for (int j = 0; j < b.m; j++) {
                c.a[i][j] = 0;
                for (int k = 0; k < m; k++) {
                    c.a[i][j] += a[i][k] * b.a[k][j];
                }
            }
        return c;
    }

    public Matrix trans() {
        Matrix c = new Matrix(m, n);
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                c.a[j][i] = this.a[i][j];
        return c;
    }

    public String toString() {
        String ans = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                ans += Integer.toString(a[i][j]) + " ";
            ans += "\n";
        }
        return ans;
    }
}

public class J04017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt();
            Matrix a = new Matrix(n, m);
            a.nextMatrix(sc);
            Matrix b = a.trans();
            System.out.println(a.mul(b));
        }
    }
}
