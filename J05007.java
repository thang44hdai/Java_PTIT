import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class nhanVien {
    String id;
    String name;
    String gen;
    String date;
    String address;
    String ma_so_thue;
    String ngay_ki;
    int d, m, y;

    nhanVien(int id, String name, String gen, String date, String address, String mst, String ngay_ki) {
        this.id = (id <= 9) ? "0000" + Integer.toString(id) : "000" + Integer.toString(id);
        this.name = name;
        this.gen = gen;
        this.date = date;
        this.address = address;
        this.ma_so_thue = mst;
        this.ngay_ki = ngay_ki;
        this.d = Integer.parseInt(date.substring(0, 2));
        this.m = Integer.parseInt(date.substring(3, 5));
        this.y = Integer.parseInt(date.substring(6));
    }

    public String toString() {
        return id + " " + name + " " + gen + " " + date + " " + address + " " + ma_so_thue + " " + ngay_ki;
    }
}

public class J05007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nhanVien a[] = new nhanVien[n];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            a[i] = new nhanVien(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(),
                    sc.nextLine());
        }
        Arrays.sort(a, 0, n, new Comparator<nhanVien>() {
            @Override
            public int compare(nhanVien o1, nhanVien o2) {
                if (o1.y != o2.y) {
                    return (o1.y < o2.y ? -1 : 1);
                } else {
                    if (o1.m != o2.m) {
                        return (o1.m < o2.m ? -1 : 1);
                    } else {
                        if (o1.d != o2.d) {
                            return (o1.d < o2.d ? -1 : 1);
                        } else {
                            return o1.id.compareTo(o2.id);
                        }
                    }
                }
            }
        });
        for(int i=0;i<n;i++)
            System.out.println(a[i]);
    }
}
