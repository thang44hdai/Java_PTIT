import java.util.*;

public class J08022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            Stack<Integer> st = new Stack<>();
            int ans[] = new int[n];
            ans[n - 1] = -1;
            st.push(n - 1);
            for (int i = n - 2; i >= 0; i--) {
                while (st.size() > 0 && a[st.peek()] <= a[i])
                    st.pop();
                if (st.isEmpty())
                    ans[i] = -1;
                else
                    ans[i] = a[st.peek()];
                st.push(i);
            }
            for (int i : ans)
                System.out.print(i + " ");
            System.out.println();
        }
    }
}
