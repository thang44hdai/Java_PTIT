import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class J07008 {
    static ArrayList<String> ans = new ArrayList<>();
    static ArrayList<Integer> vt = new ArrayList<>();

    static void Try(int i, int n, ArrayList<Integer> a) {
        if (vt.size() > 1) {
            String tmp = "";
            for (int j : vt) {
                tmp += Integer.toString(j) + " ";
            }
            ans.add(tmp);
        }
        for (int j = i; j < n; j++) {
            if (vt.size() == 0 || a.get(j) > vt.get(vt.size() - 1)) {
                vt.add(a.get(j));
                Try(j + 1, n, a);
                vt.remove(vt.size() - 1);
            }

        }
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int n = sc.nextInt();
        HashSet<Integer> st = new HashSet<>();
        ArrayList<Integer> a = new ArrayList<>();
        HashMap<Integer, Integer> mp = new HashMap<>();
        while (n-- > 0) {
            int x = sc.nextInt();
            if (mp.get(x) == null) {
                mp.put(x, 1);
                a.add(x);
            }
        }
        n = a.size();
        Try(0, n, a);
        Collections.sort(ans, new Comparator<String>() {
            public int compare(String a, String b) {
                return a.compareTo(b);
            }

        });
        for (String i : ans)
            System.out.println(i);
    }
}
