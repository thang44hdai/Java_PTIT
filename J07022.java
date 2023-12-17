import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class J07022 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> st = new ArrayList();
        while (sc.hasNext()) {
            String s = sc.next();
            try {
                int x = Integer.parseInt(s);
            } catch (Exception e) {
                st.add(s);
            }
        }
        Collections.sort(st, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });
        for (String i : st)
            System.out.print(i + " ");
    }
}
