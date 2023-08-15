import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class J01007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long f[] = new long[93];
        f[1] = f[2] = 1;
        for (int i = 3; i < 93; i++)
            f[i] = f[i - 1] + f[i - 2];
    }
}
