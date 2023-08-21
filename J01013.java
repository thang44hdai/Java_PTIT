import java.util.Scanner;

public class J01013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long sum = 0;
        while (t-- > 0) {
            int n = sc.nextInt();
            for (long i = 2; i <= (long) Math.sqrt(n); i++) {
                if (n % i == 0) {
                    while (n % i == 0) {
                        sum += i;
                        n /= i;
                    }
                }
            }
            if (n > 1)
                sum += n;

        }
        System.out.println(sum);
    }
}
