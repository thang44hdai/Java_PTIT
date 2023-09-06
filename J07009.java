import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

class IntSet {
    TreeSet<Integer> st = new TreeSet<>();

    IntSet(int a[]) {
        for (int i : a)
            st.add(i);
    }

    IntSet(TreeSet<Integer> a) {
        this.st = a;
    }

    public IntSet intersection(IntSet a) {
        TreeSet<Integer> b = new TreeSet<>();
        for (int i : this.st)
            if (a.st.contains(i))
                b.add(i);
        return new IntSet(b);
    }

    public String toString() {
        String ans = "";
        for (int i : this.st)
            ans += Integer.toString(i) + " ";
        return ans;
    }
}

public class J07009 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < m; i++)
            b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
    }
}
