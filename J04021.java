import java.util.Scanner;
import java.util.TreeSet;

class IntSet {
    TreeSet<Integer> x = new TreeSet<>();

    IntSet(int a[]) {
        for (int i : a)
            x.add(i);
    }

    public IntSet union(IntSet a) {
        for (int i : a.x)
            this.x.add(i);
        return this;
    }

    public String toString() {
        String ans = "";
        for (int i : x)
            ans += Integer.toString(i) + " ";
        return ans;
    }
}

public class J04021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < m; i++)
            b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
