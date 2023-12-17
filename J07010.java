import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class sv {
    String id;
    String name;
    String Class;
    String date;
    double gpa;

    sv(int i, String name, String Class, String date, double gpa) {
        this.id = (i < 10) ? "B20DCCN00" + Integer.toString(i) : "B20DCCN0" + Integer.toString(i);
        this.name = name;
        this.Class = Class;
        this.gpa = gpa;
        String a[] = date.split("/");
        this.date = ((a[0].length() == 2) ? a[0] : "0" + a[0]) + "/" + ((a[1].length() == 2) ? a[1] : "0" + a[1]) + "/"
                + a[2];
    }

    public String toString() {
        return this.id + " " + this.name + " " + this.Class + " " + this.date + " " + String.format("%.2f", this.gpa);
    }
}

public class J07010 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SV.in"));
        int n = sc.nextInt();
        sv a[] = new sv[n];
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            a[i] = new sv(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
        }
        for (int i = 0; i < n; i++)
            System.out.println(a[i]);
    }
}