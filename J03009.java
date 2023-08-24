import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class J03009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String space = sc.nextLine();
        while (t-- > 0) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            Map<String, Integer> mp = new HashMap<>();
            String vt[];
            vt = s2.split(" ");
            for (String i : vt) {
                mp.put(i, 1);
            }
            String check[] = s1.split(" ");
            Arrays.sort(check);
            for (String i : check) {
                if (mp.get(i) == null) {
                    mp.put(i, 1);
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
}