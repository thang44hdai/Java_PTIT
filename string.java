import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextInt();
            int check = 0;
            long f1 = 1, f2 = 1;
            long fn;
            if (t == 1 || t == 0)
                check = 1;
            for (int i = 3; i <= 92; i++) {
                fn = f1 + f2;
                f2 = f1;
                f1 = fn;
                if (a == fn) {
                    check = 1;
                }
            }
            if (check == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}