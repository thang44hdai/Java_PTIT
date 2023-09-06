import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class sinhVien {
    String id;
    String name;
    String date;
    String Class;
    String gpa;
    double diem;

    sinhVien(int i, String name, String Class, String date, double gpa) {
        String b[] = name.trim().split("\\s+");
        this.name = "";
        for (String k : b)
            this.name += k.substring(0, 1).toUpperCase() + k.substring(1, k.length()).toLowerCase() + " ";
        this.Class = Class;
        this.gpa = String.format("%.2f", gpa);
        this.id = "B20DCCN" + ((i < 10) ? "00" + Integer.toString(i) : "0" + Integer.toString(i));

        String a[] = date.split("/");
        this.date = ((a[0].length() == 1) ? "0" + a[0] : a[0]) + "/" + ((a[1].length() == 1) ? "0" + a[1] : a[1])
                + "/" + a[2];
        this.diem = gpa;
    };

    public String toString() {
        return id + " " + name + Class + " " + date + " " + gpa;
    }
}

public class J05005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sinhVien a[] = new sinhVien[n];
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            a[i-1] = new sinhVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
        }
        Arrays.sort(a, 0, n, new Comparator<sinhVien>() {
            public int compare(sinhVien x, sinhVien y) {
                return (x.diem > y.diem) ? -1 : 1;
            }

        });
        for (int i = 0; i < n; i++)
            System.out.println(a[i]);
    }
}