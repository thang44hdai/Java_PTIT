import java.util.Scanner;

public class J02007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            System.out.println("Test " + i + ":");
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] cnt = new int[100005];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
                cnt[a[j]]++;
            }
            for (int j = 0; j < n; j++)
                if (cnt[a[j]] > 0) {
                    System.out.printf("%d xuat hien %d lan\n", a[j], cnt[a[j]]);
                    cnt[a[j]] = 0;
                }
        }
    }
}
