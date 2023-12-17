import java.util.Scanner;

class SinhVien {
    private String hoTen, lop, ngaySinh;
    private float diem;

    public SinhVien(String hoTen, String lop, String ngaySinh, float diem) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.ngaySinh = ngaySinh;
        this.diem = diem;
        this.ngaySinh = "";
        String a[] = ngaySinh.split("/");
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i].length() < 2) {
                this.ngaySinh += "0" + a[i];
            } else {
                this.ngaySinh += a[i];
            }
            this.ngaySinh += "/";
        }
        int n = a.length;
        int cnt = 4 - a[n - 1].length();
        while (cnt-- > 0) {
            a[n - 1] = "0" + a[n - 1];
        }
        this.ngaySinh += a[n - 1];
    }

    public String toString() {
        return "B20DCCN001" + " " + this.hoTen + " " + this.lop + " " + this.ngaySinh + " "
                + (String.format("%.2f", this.diem));
    }
}

public class baitap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien t = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextFloat());
        System.out.println(t);
    }
}