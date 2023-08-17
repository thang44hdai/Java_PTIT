import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String space = sc.nextLine();
        while (t-- > 0) {
            String n = sc.nextLine();
            System.out.println(sol(n));
        }
    }

    private static String sol(String n) {
        long sum = 0;
        int len = n.length();
        for (int i = 0; i < len - 1; i++) {
            int x = n.charAt(i) - '0';
            int y = n.charAt(i + 1) - '0';
            if (Math.abs(x - y) != 2)
                return "NO";
            else
                sum += x;
        }
        sum += n.charAt(len - 1) - '0';
        if (sum % 10 == 0)
            return "YES";
        return "NO";
    }
}