import java.util.Scanner;

class hs {
    String id;
    String name;
    double toan, van, anh, ly, sinh, su, dia, gdcd, cn;
    double gpa;
    String xeploai;

    hs(int id, String x, int a[], int n) {
        this.id = "HS" + (id <= 9 ? "0" + Integer.toString(id) : Integer.toString(id));
        this.name = x;
        this.toan = a[0];
        this.van = a[1];
        this.anh = a[2];
        this.ly = a[3];
        this.sinh = a[4];
        this.su = a[5];
        this.dia = a[6];
        this.gdcd = a[7];
        this.cn = a[8];
        this.gpa = (toan * 2 + van * 2 + anh + sinh + su + dia + ly + gdcd + cn) / 11;
        if (this.gpa >= 9)
            this.xeploai = "XUAT SAC";
        else if (this.gpa >= 8)
            this.xeploai = "GIOI";
        else if (this.gpa >= 7)
            this.xeploai = "KHA";
        else if (this.gpa >= 5)
            this.xeploai = "TB";
        else
            this.xeploai = "KHA";
    }

    public String toString() {
        return this.id + " " + name + String.format("%.1f", this.gpa) + " " + this.xeploai;
    }
}

public class J05018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            String name = sc.nextLine();
        }
    }
}
