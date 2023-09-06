import java.util.Scanner;

class sinhVien {
    String id;
    String name;
    String date;
    String Class;
    String gpa;

    sinhVien(int i, String name, String Class, String date, double gpa) {
        this.name = name;
        this.Class = Class;
        this.gpa = String.format("%.2f", gpa);
        this.id = "B20DCCN" + ((i < 10) ? "00" + Integer.toString(i) : "0" + Integer.toString(i));
        
        String a[] = date.split("/");
        this.date = ((a[0].length() == 1) ? "0" + a[0] : a[0]) + "/" + ((a[1].length() == 1) ? "0" + a[1] : a[1])
                + "/" + a[2];
    };

    public String toString() {
        return id + " " + name + " " + Class + " " + date + " " + gpa;
    }
}

public class J05003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            sinhVien p = new sinhVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
            System.out.println(p);
        }
    }
}
