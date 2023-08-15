import java.util.Scanner;

public class J01010_ok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long ans = sol(Long.toString(n));
            if (ans == 0)
                System.out.println("INVALID");
            else
                System.out.println(ans);
        }

    }

    public static long sol(String s) {
        long sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (x == '0' || x == '8' || x == '9')
                sum = sum * 10;
            else if (x == '1')
                sum = sum * 10 + 1;
            else
                return 0;
        }
        return sum;
    }

}
