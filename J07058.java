import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class monThi {
    String maMon;
    String name;
    String hinhThuc;

    monThi(String x, String y, String z) {
        this.maMon = x;
        this.name = y;
        this.hinhThuc = z;
    }

    public String toString() {
        return this.maMon + " " + this.name + " " + this.hinhThuc;
    }

}

public class J07058 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt();
        String space = sc.nextLine();
        Vector<monThi> vt = new Vector<>();
        for (int i = 0; i < n; i++)
            vt.add(new monThi(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        // vt.sort(new Comparator<monThi>() {
        //     public int compare(monThi a, monThi b) {
        //         return a.maMon.compareTo(b.maMon);
        //     }
        // });
        Collections.sort(vt, new Comparator<monThi>() {
            public int compare(monThi a, monThi b) {
                return a.maMon.compareTo(b.maMon);
            }

        });
        for (int i = 0; i < n; i++)
            System.out.println(vt.get(i));
    }

}
