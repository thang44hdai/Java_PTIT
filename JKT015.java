import java.util.ArrayList;
import java.util.Scanner;

public class JKT015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList<Character> vt = new ArrayList<>();
        int n = s.length();
        int idx = 0;
        for (int j = 0; j < n; j++) {
            char i = s.charAt(j);
            if (i != '<' && i != '>' && i != '-') {
                vt.add(idx, i);
                idx++;
            } else {
                if (i == '-') {
                    if (idx > 0) {
                        vt.remove(idx - 1);
                        idx--;
                    }
                } else if (i == '<') {
                    if (idx > 0)
                        idx--;
                } else if (i == '>') {
                    if (idx < vt.size())
                        idx++;
                }
            }
            // System.out.println(idx);
        }
        for (char i : vt)
            System.out.print(i);
    }
}
