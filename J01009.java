import java.util.Scanner;

public class J01009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long total = 0;
        long current_sum = 1;
        for (int i = 1; i <= n; i++) {
            current_sum *= (long) i;
            total += current_sum;
        }
        System.out.println(total);
    }
}
