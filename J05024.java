import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

class sinhVien {
    String id;
    String name;
    String Class;
    String email;
    String khoa;

    sinhVien(String x, String y, String z, String t) {
        this.id = x;
        this.name = y;
        this.Class = z;
        this.email = t;
        switch (x.substring(5, 7)) {
            case "CN":
                this.khoa = "CONG NGHE THONG TIN";
                break;
            case "AT":
                this.khoa = "AN TOAN THONG TIN";
                break;
            case "KT":
                this.khoa = "KE TOAN";
                break;
            case "VT":
                this.khoa = "VIEN THONG";
                break;
            case "DT":
                this.khoa = "DIEN TU";
                break;
        }
    }

    public String toString() {
        return id + " " + name + " " + Class + " " + email;
    }
}

public class J05024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, Vector<sinhVien>> mp = new HashMap<>();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String x = sc.nextLine();
            String y = sc.nextLine();
            String z = sc.nextLine();
            String t = sc.nextLine();
            sinhVien a = new sinhVien(x, y, z, t);
            if (mp.containsKey(a.khoa)) {
                if (a.khoa.equals("CONG NGHE THONG TIN") || a.khoa.equals("AN TOAN THONG TIN")) {
                    if (a.Class.charAt(0) != 'E')
                        mp.get(a.khoa).add(a);
                } else {
                    mp.get(a.khoa).add(a);
                }
            } else {
                Vector<sinhVien> vt = new Vector<>();
                if (a.khoa.equals("CONG NGHE THONG TIN") || a.khoa.equals("AN TOAN THONG TIN")) {
                    if (a.Class.charAt(0) != 'E') {
                        vt.add(a);
                        mp.put(a.khoa, vt);
                    }
                } else {
                    vt.add(a);
                    mp.put(a.khoa, vt);
                }
            }
        }
        int q = sc.nextInt();
        sc.nextLine();
        while (q-- > 0) {
            String s = sc.nextLine();
            s = s.toUpperCase();
            System.out.println("DANH SACH SINH VIEN NGANH " + s + ":");
            for (sinhVien i : mp.get(s)) {
                System.out.println(i);
            }
        }
    }
}
