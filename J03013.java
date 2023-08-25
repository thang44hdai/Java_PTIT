import java.math.BigInteger;
import java.util.Scanner;

public class J03013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            BigInteger x = new BigInteger(sc.next());
            String check;
            BigInteger y = new BigInteger(sc.next());
            if (x.compareTo(y) >= 1)
                check = x.toString();
            else
                check = y.toString();
            BigInteger ans = x.subtract(y);
            ans = ans.abs();
            String s = ans.toString();
            for (int i = 0; i < check.length() - s.length(); i++)
                System.out.print("0");
            System.out.println(ans);
        }
    }
}
