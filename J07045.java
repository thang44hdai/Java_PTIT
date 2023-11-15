import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class LoaiPhong implements Comparable<LoaiPhong> {
    String kh, name;
    String dongia, phi;

    LoaiPhong(String s) {
        String f[] = s.trim().split(" ");
        this.kh = f[0];
        this.name = f[1];
        this.dongia = f[2];
        this.phi = f[3];
    }

    public String toString() {
        return this.kh + " " + this.name + " " + this.dongia + " " + this.phi;
    }

    public int compareTo(LoaiPhong a) {
        return this.name.compareTo(a.name);
    }
}

public class J07045 {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while (n-- > 0) {
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for (LoaiPhong tmp : ds) {
            System.out.println(tmp);
        }
    }
}
