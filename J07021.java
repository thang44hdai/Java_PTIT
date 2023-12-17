import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class J07021 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while (sc.hasNextLine()) {
            String s = sc.nextLine().trim();
            if (s.equals("END"))
                break;
            String a[] = s.split("\\s+");
            for (String i : a) {
                System.out.print(Character.toUpperCase(i.charAt(0)) +
                        i.substring(1).toLowerCase() + " ");
            }
        
            System.out.println();
        }
    }
}
