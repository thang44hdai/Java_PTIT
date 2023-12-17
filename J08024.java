import java.util.*;

public class J08024 {
    static long a[] = new long[1000];

    static void sinh() {
        Queue<Long> q = new PriorityQueue<>();
        q.add((long) 9);
        int i = 1;
        a[0] = 9;
        while (i < 1000) {
            long top = q.poll();
            q.add(top * 10);
            q.add(top * 10 + 9);
            a[i++] = top;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sinh();
        while (t-- > 0) {
            int n = sc.nextInt();
            for (int i = 0; i < 1000; i++) {
                if (a[i] % n == 0) {
                    System.out.println(a[i]);
                    break;
                }
            }

        }
    }
}
