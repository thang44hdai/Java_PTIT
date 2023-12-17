import java.util.HashSet;
import java.util.TreeSet;
import java.util.*;

public class J03038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Character> st = new TreeSet<>();
        String n = sc.nextLine();
        for (int i = 0; i < n.length(); i++) {
            st.add(n.charAt(i));
        }
        System.out.println(st.size());
    }
}
