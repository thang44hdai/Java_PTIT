import java.util.HashMap;
import java.util.Scanner;

public class J08015 {
    public static long c(long n) {
        return n * (n - 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            HashMap<Integer, Long> mp = new HashMap<>();
            int Min = (int) -1e6;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                Min = Math.min(Min, a[i]);
                if (mp.get(a[i]) == null)
                    mp.put(a[i], (long) 1);
                else
                    mp.put(a[i], mp.get(a[i]) + 1);
            }
            long cnt = 0;
            for (int i : mp.keySet()) {
                if (mp.get(k - i) != null && mp.get(k - i) != 0 && mp.get(i) != 0) {
                    if (i * 2 == k)
                        cnt += c(mp.get(i));
                    else {
                        cnt += mp.get(i) * mp.get(k - i);
                        mp.put(i, (long) 0);
                        mp.put(k - i, (long) 0);
                    }
                }
            }
            System.out.println(cnt);

        }
    }
}
