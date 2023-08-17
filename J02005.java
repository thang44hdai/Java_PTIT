import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class J02005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < m; i++)
            b[i] = sc.nextInt();
        HashSet<Integer> st = new HashSet<Integer>();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (a[i] == b[j]) {
                    st.add(a[i]);
                    break;
                }
        n = st.size();
        int[] ans = new int[n];
        int idx = 0;
        for (int i : st) {
            ans[idx++] = i;
        }
        Arrays.sort(ans);
        for (int i = 0; i < n; i++)
            System.out.print(ans[i] + " ");
    }
}
