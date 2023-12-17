import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class mh {
    String mamon, name, tc;

    mh(String a, String b, String c) {
        this.mamon = a;
        this.name = b;
        this.tc = c;
    }

    public String toString() {
        return mamon + " " + name + " " + tc;
    }
}

public class J07034 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt();
        sc.nextLine();
        mh a[] = new mh[n];
        for (int i = 0; i < n; i++)
            a[i] = new mh(sc.nextLine(), sc.nextLine(), sc.nextLine());
        Arrays.sort(a, new Comparator<mh>() {
            @Override
            public int compare(mh o1, mh o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        for (mh i : a)
            System.out.println(i);
    }
}
