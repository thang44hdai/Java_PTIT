import java.util.Scanner;

class nhanVien {
    String id;
    String name;
    String gen;
    String date;
    String address;
    String ma_so_thue;
    String ngay_ki;

    nhanVien(int id, String name, String gen, String date, String address, String mst, String ngay_ki) {
        this.id = (id <= 9) ? "0000" + Integer.toString(id) : "000" + Integer.toString(id);
        this.name = name;
        this.gen = gen;
        this.date = date;
        this.address = address;
        this.ma_so_thue = mst;
        this.ngay_ki = ngay_ki;
    }

    public String toString() {
        return id + " " + name + " " + gen + " " + date + " " + address + " " + ma_so_thue + " " + ngay_ki;
    }
}

public class J05006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            nhanVien p = new nhanVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(),
                    sc.nextLine());
            System.out.println(p);
        }
    }
}
