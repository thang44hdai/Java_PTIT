import java.util.Scanner;

public class J03026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String space = sc.nextLine();
        while (t-- > 0) {
            String x = sc.nextLine();
            String y = sc.nextLine();
            if (x.compareTo(y) == 0) {
                System.out.println(-1);
            } else {
                System.out.println(x.length() > y.length() ? x.length() : y.length());
            }
        }
    }
}
