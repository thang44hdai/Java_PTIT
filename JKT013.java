import java.util.*;

public class JKT013 {
    static ArrayList<String> a = new ArrayList<>();

    static void Try(int i, int n, String s) {
        if (i > n)
            return;
        if (s.length() > 0)
            a.add(s);
        Try(i + 1, n, s + "6");
        Try(i + 1, n, s + "8");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Try(0, 14, "");
        int t = sc.nextInt();
        a.sort(new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length())
                    return o1.compareTo(o2);
                else {
                    return o1.length() < o2.length() ? -1 : 1;
                }
            }

        });
        while (t-- > 0) {
            int n = sc.nextInt();
            int i = 0;
            ArrayList<String> ans = new ArrayList<>();
            while (i < a.size()) {
                if (a.get(i).length() <= n) {
                    ans.add(a.get(i));
                    i++;
                } else
                    break;
            }
            Collections.reverse(ans);
            System.out.println(ans.size());
            for (String j : ans)
                System.out.print(j + " ");
            System.out.println();
        }
    }
}
