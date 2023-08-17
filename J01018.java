import java.util.Scanner;

public class J01018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String space = sc.nextLine();
        while (t-- > 0) {
            String n = sc.nextLine();
            System.out.println(sol(n));
        }
    }

    public static String sol(String n) {
        int len = n.length();
        long sum = 0;
        for (int i = 0; i < len - 1; i++) {
            int x = n.charAt(i) - '0';
            int y = n.charAt(i + 1) - '0';
            if (Math.abs(x - y) != 2) {
                return "NO";
            } else
                sum += (long) (n.charAt(i) - '0');
        }
        sum += (long) (n.charAt(len - 1) - '0');
        if (sum % 10 == 0)
            return "YES";
        else
            return "NO";
    }
}
