import java.util.Scanner;

public class J02037 {
    static String sol(String a[], int n) {
        int even = 0;
        for (String string : a) {
            if (Integer.parseInt(string) % 2 == 0) {
                even++;
            }
        }
        if (n % 2 == 0) {
            if (even > n - even)
                return "YES";
            return "NO";
        } else {
            if (even < n - even)
                return "YES";
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String a[] = sc.nextLine().trim().split(" ");
            int n = a.length;
            System.out.println(sol(a, n));
        }
    }
}
