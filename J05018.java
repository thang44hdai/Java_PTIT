import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class hs {
    String id;
    String name;
    double toan, van, anh, ly, hoa, sinh, su, dia, gdcd, cn;
    double gpa;
    String xeploai;

    hs(int id, String x, double a[]) {
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
        this.hoa = a[9];
        this.gpa = (toan * 2.0 + van * 2.0 + anh + sinh + su + dia + hoa + ly + gdcd + cn) / 12.0;
        this.gpa = Math.round(this.gpa*10.0)/10.0;
        if (this.gpa >= 9.0)
            this.xeploai = "XUAT SAC";
        else if (this.gpa >= 8.0)
            this.xeploai = "GIOI";
        else if (this.gpa >= 7.0)
            this.xeploai = "KHA";
        else if (this.gpa >= 5.0)
            this.xeploai = "TB";
        else
            this.xeploai = "YEU";
    }

    public String toString() {
        return this.id + " " + name + " " + String.format("%.1f", this.gpa) + " " + this.xeploai;
    }
}

public class J05018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        hs f[] = new hs[n];

        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double a[] = new double[10];
            for (int idx = 0; idx < 10; idx++)
                a[idx] = sc.nextDouble();
            f[i - 1] = new hs(i, name, a);
        }
        Arrays.sort(f, 0, n, new Comparator<hs>() {

            @Override
            public int compare(hs o1, hs o2) {
                if (o1.gpa != o2.gpa)
                    return o1.gpa > o2.gpa ? -1 : 1;
                return o1.id.compareTo(o2.id);
            }

        });
        for (int i = 0; i < n; i++)
            System.out.println(f[i]);
    }
}
