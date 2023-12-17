import java.util.*;

public class J08021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int dp[] = new int[s.length()];
            int ans = 0;
            Stack<Integer> a = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                if (a.isEmpty())
                    a.push(i);
                else {
                    if (s.charAt(i) == ')' && s.charAt(a.peek()) == '(') {
                        dp[i] = i - a.peek() + 1;
                        if (a.peek() > 0 && s.charAt(a.peek() - 1) == ')') {
                            dp[i] += dp[a.peek() - 1];
                        }
                        ans = Math.max(ans, dp[i]);
                        a.pop();
                    } else
                        a.push(i);
                }
            }
            System.out.println(ans);
        }
    }
}
