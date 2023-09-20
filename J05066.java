import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

class nhanVien {
    String name;
    String chucVu;
    String hesoluong;
    String sohieu;

    nhanVien(String x) {
        this.name = x.substring(8);
        this.chucVu = x.substring(0, 2);
        this.hesoluong = x.substring(2, 4);
        this.sohieu = x.substring(4, 7);
    };

    public String toString() {
        return name + " " + chucVu + " " + sohieu + " " + hesoluong;
    }
}

public class J05066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        nhanVien a[] = new nhanVien[n];
        for (int i = 0; i < n; i++) {
            nhanVien x = new nhanVien(sc.nextLine());
            if (x.chucVu.equals("GD")) {
                if (Integer.parseInt(x.sohieu) >= 2)
                    x.chucVu = "NV";
            } else if (x.chucVu.equals("TP") || x.chucVu.equals("PP")) {
                if (Integer.parseInt(x.sohieu) >= 4)
                    x.chucVu = "NV";
            }
            a[i] = x;
        }
        Arrays.sort(a, 0, n, new Comparator<nhanVien>() {
            @Override
            public int compare(nhanVien o1, nhanVien o2) {
                if (o1.hesoluong.compareTo(o2.hesoluong) != 0) {
                    return o2.hesoluong.compareTo(o1.hesoluong);
                }
                return o1.sohieu.compareTo(o2.sohieu);
            }
        });
        int m = sc.nextInt();
        sc.nextLine();
        while (m-- > 0) {
            String q = sc.nextLine();
            q = q.toUpperCase();
            for (nhanVien i : a) {
                String check = i.name;
                check = check.toUpperCase();
                if (check.contains(q))
                    System.out.println(i);
            }
            System.out.println("");
        }

    }
}
