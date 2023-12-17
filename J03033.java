import java.math.BigInteger;
import java.util.Scanner;

public class J03033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            BigInteger x = sc.nextBigInteger();
            BigInteger y = sc.nextBigInteger();
            System.out.println(x.multiply(y).divide(x.gcd(y)));
        }

    }
}
