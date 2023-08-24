import java.util.Scanner;
import java.util.Vector;

public class J03010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String space = sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            Vector<String> a = new Vector<String>();
            String x = "";
            s = s.toLowerCase() + " ";
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    if (x != "") {
                        a.add(x);
                        x = "";
                    }
                } else {
                    x += s.charAt(i);
                }
            }
            
            System.out.println();
        }
    }
}
