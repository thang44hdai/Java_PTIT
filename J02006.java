import java.util.Scanner;

public class J02006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[1005];
        for (int i = 0; i < n; i++)
            a[sc.nextInt()] = 1;
        for (int i = 0; i < m; i++)
            a[sc.nextInt()] = 1;
        for (int i = 0; i < 1005; i++)
            if (a[i] == 1)
                System.out.print(i + " ");
    }
}
