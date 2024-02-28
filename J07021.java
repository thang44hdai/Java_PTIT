import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class J07021 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        Vector<String> vt = new Vector<>();
        while (sc.hasNextLine()) {
            String s = sc.nextLine().trim();
            if (s.equals("END"))
                break;
            String a[] = s.split("\\s+");
            String tmp = "";
            for (String i : a) {
                tmp += i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase() + " ";
            }
            vt.add(tmp);
        }
        for (String i : vt)
            System.out.println(i);

    }
}
