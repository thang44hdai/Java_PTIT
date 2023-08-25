import java.util.Scanner;
import java.util.Stack;

public class J03027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (st.empty())
                st.push(s.charAt(i));
            else {
                char top = st.peek();
                if (top == s.charAt(i))
                    st.pop();
                else
                    st.push(s.charAt(i));
            }
        }
        if (st.empty())
            System.out.println("Empty String");
        else {
            String ans = "";
            while (!st.empty()) {
                ans = st.peek() + ans;
                st.pop();
            }
            System.out.println(ans);
        }

    }
}
