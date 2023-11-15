import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class loaiphong {
    String kh, name;
    String dongia, phi;

    loaiphong(String kh, String name, String dongia, String phi) {
        this.kh = kh;
        this.name = name;
        this.dongia = dongia;
        this.phi = phi;
    }

    public String toString() {
        return this.kh + " " + this.name + " " + this.dongia + " " + this.phi;
    }
}

public class J07045 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("PHONG.in"));
        int n = sc.nextInt();
        loaiphong a[] = new loaiphong[n];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String f[] = sc.nextLine().trim().split(" ");
            a[i] = new loaiphong(f[0], f[1], f[2], f[3]);
        }
        Arrays.sort(a, 0, n, new Comparator<loaiphong>() {
            @Override
            public int compare(loaiphong o1, loaiphong o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        for (loaiphong i : a)
            System.out.println(i);
    }
}
