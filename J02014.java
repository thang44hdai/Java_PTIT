import java.util.Scanner;

public class J02014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }
            int check = a[0];
            boolean flag = true;
            for (int i = 1; i < n; i++) {
                check += a[i];
                if ((check - a[i]) * 2 == sum - a[i]) {
                    System.out.println(i+1);
                    flag = false;
                    break;
                }
            }
            if (!flag)
                System.out.println(-1);
        }
    }
}
