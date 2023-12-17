
import java.util.*;

public class J08020 {
    static HashSet<Character> a = new HashSet<>();

    public static String sol(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (a.contains(s.charAt(i)))
                st.push(s.charAt(i));
            else {
                if (st.size() == 0)
                    return "NO";
                else {
                    if (s.charAt(i) == ')' && st.peek() == '(')
                        st.pop();
                    else if (s.charAt(i) == ']' && st.peek() == '[')
                        st.pop();
                    else if (s.charAt(i) == '}' && st.peek() == '{')
                        st.pop();
                    else
                        return "NO";
                }
            }
        }
        if (st.size() == 0)
            return "YES";
        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        a.add('(');
        a.add('[');
        a.add('{');
        while (t-- > 0) {
            String s = sc.nextLine();
            System.out.println(sol(s));
        }
    }
}
