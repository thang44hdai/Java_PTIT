import java.math.BigInteger;
import java.util.Scanner;

public class baitap5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        while (s.length() > 1) {
            int n = s.length();
            BigInteger x = new BigInteger(s.substring(0, n / 2));
            BigInteger y = new BigInteger(s.substring(n / 2));
            x = x.add(y);
            System.out.println(x);
            s = x.toString();
        }
    }
}
