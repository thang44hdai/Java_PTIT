import java.util.*;

public class J02016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long a[] = new long[n];
            Map<Long, Integer> mp = new HashMap<>();
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                mp.put(a[i] * a[i], 1);
            }
            int check = 0;
            Arrays.sort(a, 0, n);
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (mp.containsKey(a[i] * a[i] + a[j] * a[j])) {
                        System.out.println("YES");
                        check = 1;
                        break;
                    }
                }
                if (check == 1)
                    break;
            }
            if (check == 0)
                System.out.println("NO");
        }
    }
}
