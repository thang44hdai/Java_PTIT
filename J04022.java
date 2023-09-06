import java.util.Scanner;
import java.util.TreeSet;

class WordSet {
    TreeSet<String> st = new TreeSet<>();

    WordSet(String s) {
        String a[] = s.split(" ");
        for (String i : a)
            st.add(i.toLowerCase());
    }

    WordSet(TreeSet<String> a) {
        this.st = a;
    }

    public WordSet union(WordSet a) {
        TreeSet<String> b = new TreeSet<>(st);

        for (String i : a.st)
            b.add(i);
        return new WordSet(b);
    }

    public WordSet intersection(WordSet a) {
        TreeSet<String> b = new TreeSet<>();
        for (String i : st)
            if (a.st.contains(i)) {
                b.add(i);
            }
        return new WordSet(b);
    }

    public String toString() {
        String ans = "";
        for (String i : st)
            ans += i + " ";
        return ans;
    }

}

public class J04022 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}

