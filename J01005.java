import java.util.Scanner;

public class J01005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int h = sc.nextInt();
            double s = (double) n * h / 2;
            double s1 = s / n;
            for (int i = 1; i < n; i++) {
                double s2 = i * s1;
                double  h2 = Math.sqrt(s2 / s) * h;;
                System.out.printf("%.6f ", h2);
            }
            System.out.println();
        }
    }
}
