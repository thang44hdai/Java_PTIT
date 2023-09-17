import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

class sinhVien {
    String id;
    String name;
    String Class;
    String email;
    int khoa;

    sinhVien(String x, String y, String z, String t) {
        this.id = x;
        this.name = y;
        this.Class = z;
        this.email = t;
        this.khoa = Integer.parseInt(z.substring(1, 3));
    }

    public String toString() {
        return id + " " + name + " " + Class + " " + email;
    }
}

public class J05023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Vector<sinhVien>> mp = new HashMap<>();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String x = sc.nextLine();
            String y = sc.nextLine();
            String z = sc.nextLine();
            String t = sc.nextLine();
            sinhVien a = new sinhVien(x, y, z, t);
            if (mp.containsKey(a.khoa)) {
                mp.get(a.khoa).add(a);
            } else {
                Vector<sinhVien> vt = new Vector<>();
                vt.add(a);
                mp.put(a.khoa, vt);
            }
        }
        int q = sc.nextInt();
        while (q-- > 0) {
            int num = sc.nextInt();
            num = num % 100;
            System.out.println("DANH SACH SINH VIEN KHOA 20" + num + ":");
            for (sinhVien i : mp.get(num)) {
                System.out.println(i);
            }
        }
    }
}
