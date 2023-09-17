import java.util.*;

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

public class J05022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, Vector<sinhVien>> mp = new HashMap<>();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String Class = sc.nextLine();
            String email = sc.nextLine();
            Vector<sinhVien> x = new Vector<>();
            x.add(new sinhVien(id, name, Class, email));
            if (mp.containsKey(Class))
                mp.get(Class).add(new sinhVien(id, name, Class, email));
            else
                mp.put(Class, x);

        }
        int q = sc.nextInt();
        sc.nextLine();
        while (q-- > 0) {
            String s = sc.nextLine();
            System.out.printf("DANH SACH SINH VIEN LOP %s:\n", s);
            for (sinhVien i : mp.get(s))
                System.out.println(i);
        }
    }
}
