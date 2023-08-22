import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class J02034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        int max = 0;
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            max = Math.max(max, x);
            mp.put(x, 1);
        }
        int check = 0;
        for (int i = 1; i <= max; i++) {
            if (mp.get(i) == null) {
                System.out.println(i);
                check = 1;
            }
        }
        if (check == 0) {
            System.out.println("Excellent!");
        }
    }
}
