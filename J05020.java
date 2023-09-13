import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

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

public class J05020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sinhVien a[] = new sinhVien[n];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            a[i] = new sinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(a, 0, n, new Comparator<sinhVien>() {

            @Override
            public int compare(sinhVien o1, sinhVien o2) {

                return o1.Class.compareTo(o2.Class) != 0 ? o1.Class.compareTo(o2.Class) : o1.id.compareTo(o2.id);
            }
        });
        for (sinhVien i : a)
            System.out.println(i);
    }
}
