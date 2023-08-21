<<<<<<< HEAD
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        mp.put(1,  1);
        mp.put(2, 1);
        int x = mp.get(1);
        x++;
        mp.put(1, x);
        Set<Integer> st= mp.keySet();
        for (int a : st) {
            System.out.println(mp.get(a));
        }

=======
import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), x;
        int a[] = new int[1001];
        int b[] = new int[1001];
        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            a[x] = 1;
        }
        for (int i = 0; i < m; i++) {
            x = sc.nextInt();
            b[x] = 1;
        }
        for (int i = 1; i <= 1000; i++)
            if (a[i] == 1 && b[i] == 1)
                System.out.printf("%d ", i);
>>>>>>> b958eb64f2029d69e3856a4787de6b3819be8bac
    }
}