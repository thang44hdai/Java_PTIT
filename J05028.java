import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

class doanh_nghiep {
    String name;
    String id;
    int slot;

    doanh_nghiep(String x, String y, int z) {
        this.id = x;
        this.name = y;
        this.slot = z;
    }

    public String toString() {
        return this.id + " " + this.name + " " + Integer.toString(slot);
    }
}

public class J05028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        doanh_nghiep a[] = new doanh_nghiep[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            a[i] = new doanh_nghiep(sc.nextLine(), sc.nextLine(), sc.nextInt());
        }
        Arrays.sort(a, 0, n, new Comparator<doanh_nghiep>() {

            @Override
            public int compare(doanh_nghiep o1, doanh_nghiep o2) {
                if (o1.slot != o2.slot)
                    return (o1.slot > o2.slot) ? -1 : 1;
                return o1.id.compareTo(o2.id);
            }

        });
        for (doanh_nghiep i : a)
            System.out.println(i);
    }
}
