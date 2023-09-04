import java.util.*;

class NV {
    String name;
    int luong;
    int soNgayCong;
    int thuong;
    int phuCap;

    NV(String name, int luongCoBan, int soNgayCong, String chucVu) {
        this.name = name;
        this.luong = luongCoBan * soNgayCong;
        this.soNgayCong = soNgayCong;
        switch (chucVu) {
            case "GD":
                this.phuCap = 250000;
                break;
            case "PGD":
                this.phuCap = 200000;
                break;
            case "TP":
                this.phuCap = 180000;
                break;
            case "NV":
                this.phuCap = 150000;
                break;
        }
        if (soNgayCong >=25)
            this.thuong = this.luong/5;
        else if (soNgayCong >= 22)
            this.thuong = this.luong / 10;
        else
            this.thuong = 0;
    }

    public String toString() {
        return "NV01 " + this.name + " " + this.luong + " " + this.thuong + " " + this.phuCap
                + " " + (this.luong + this.thuong + this.phuCap);
    }
}

public class J04012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x, y;
        int a, b;
        x = sc.nextLine();
        a = sc.nextInt();
        b = sc.nextInt();
        sc.nextLine();
        y = sc.nextLine();
        NV p = new NV(x, a, b, y);
        System.out.println(p);
    }
}
