import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class J07078 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("String.in"));
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            String n = sc.nextLine();
            if (s.contains(n)) {
                Vector<Integer> vt = new Vector<>();
                int l = s.length();
                int r = n.length();
                for (int i = 0; i < l; i++) {
                    if (i + r - 1 < l) {
                        if (s.substring(i, i + r).equals(n))
                            vt.add(i + 1);
                    }
                }
                for (int i : vt)
                    System.out.print(i + " ");
                System.out.println();
            }
        }

    }
}
