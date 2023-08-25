import java.util.Scanner;
import java.util.Stack;

public class J03032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String space = sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            Stack<Character> st = new Stack<>();
            int n = s.length();
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) != ' ') {
                    st.push(s.charAt(i));
                } else {
                    while (!st.empty()) {
                        System.out.print(st.peek());
                        st.pop();
                    }
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
