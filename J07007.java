import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class WordSet {
    TreeSet<String> st = new TreeSet<>();

    public WordSet(String fileName) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        while (sc.hasNext()) {
            st.add(sc.next().toLowerCase());
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (String i : st) {
            s += i + "\n";
        }
        return s;
    }

}

public class J07007 {
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}
