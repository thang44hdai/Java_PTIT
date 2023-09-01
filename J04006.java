import java.util.*;

class thiSinh {
    String name;
    String date;
    String Class;
    float point;

    thiSinh(String name, String Class, String date, float point) {
        this.name = name;
        this.date = date;
        this.point = point;
        this.Class = Class;
        this.date = "";
        String a[] = date.split("/");
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i].length() < 2)
                this.date += "0" + a[i];
            else
                this.date += a[i];
            this.date += "/";
        }
        int n = a.length;
        int cnt = 4 - a[n - 1].length();
        while (cnt-- > 0) {
            a[n - 1] = "0" + a[n - 1];
        }
        this.date += a[n - 1];
    }

    void Output() {
        System.out.printf("B20DCCN001 %s %s %s %.2f", name, Class, date, point);
    }
}

public class J04006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        thiSinh p = new thiSinh(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextFloat());
        p.Output();
    }
}
