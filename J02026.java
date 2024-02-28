import java.util.*;

public class J02026 {
    public static Vector<Integer> vt = new Vector<>();

    public static void Try(int i, int n, int k, int a[]) {
        if (vt.size() == k) {
            for (Integer j : vt) {
                System.out.print(j + " ");
            }
            System.out.println();
            return;
        }
        for (int j = i; j < n; j++) {
            vt.add(a[j]);
            Try(j + 1, n, k, a);
            vt.remove(vt.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            Arrays.sort(a);
            Try(0, n, k, a);
        }
    }
}
