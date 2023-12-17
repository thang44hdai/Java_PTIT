import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class cv {
    String name, date;
    float lt, th;
    float dt;
    int age;
    int diem;
    String xeploai;

    cv(String name, String date, float lt, float th) {
        this.name = name;
        this.date = date;
        this.lt = lt;
        this.th = th;
        String a[] = date.split("/");
        this.age = 2021 - Integer.parseInt(a[2]);
        if (lt >= 8.0 && th >= 8.0)
            this.dt = (float) 1.0;
        else if (lt >= 7.5 && th >= 7.5)
            this.dt = (float) 0.5;
        else
            this.dt = (float) 0.0;
        this.diem = (int) Math.round((lt + th) / 2 + this.dt);
        if (this.diem > 10)
            this.diem = 10;
        if (this.diem < 5)
            this.xeploai = "Truot";
        else if (this.diem < 7)
            this.xeploai = "Trung binh";
        else if (this.diem == 7)
            this.xeploai = "Kha";
        else if (this.diem == 8)
            this.xeploai = "Gioi";
        else if (this.diem == 9 || this.diem == 10)
            this.xeploai = "Xuat sac";
    }

    public String toString() {
        return this.name + " " + this.age + " " + this.diem + " " + this.xeploai;
    }
}

public class J05060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        cv a[] = new cv[n];
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String x = sc.nextLine();
            String y = sc.nextLine();
            float z = sc.nextFloat();
            float t = sc.nextFloat();
            a[i] = new cv(x, y, z, t);
            System.out.print("PH" + String.format("%02d", i + 1) + " ");
            System.out.println(a[i]);
        }

    }
}
