import java.util.*;

public class JKT014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            Stack<Integer> st = new Stack<>();
            st.push(0);
            int ans[] = new int[n];
            ans[0] = 1;
            int idx = 1;
            for (int i = 1; i < n; i++) {
                while (st.size() > 0 && a[st.peek()] <= a[i]) {
                    st.pop();
                }
                if (st.size() == 0) {
                    ans[idx++] = i + 1;
                } else {
                    ans[idx++] = i - st.peek();
                }
                st.push(i);
            }
            for (int i : ans)
                System.out.print(i + " ");
            System.out.println();
        }
    }
}
