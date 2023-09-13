import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

class sinhVien {
    String name, Class, id, email;

    sinhVien(String x, String y, String z, String t) {
        this.id = x;
        this.name = y;
        this.Class = z;
        this.email = t;
    }

    public String toString() {
        return id + " " + name + " " + Class + " " + email;
    }
}

public class J05021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<sinhVien> vt = new Vector<>();

        while (sc.hasNext()) {
            vt.add(new sinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }

        vt.sort(new Comparator<sinhVien>() {

            @Override
            public int compare(sinhVien o1, sinhVien o2) {
                return o1.id.compareTo(o2.id);
            }
        });
        for (sinhVien i : vt)
            System.out.println(i);
    }
}
