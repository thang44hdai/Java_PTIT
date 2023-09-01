import java.util.*;

class thiSinh {
    String name;
    String date;
    double point;

    thiSinh(String name, String date, double x, double y, double z) {
        this.name = name;
        this.date = date;
        this.point = x + y + z;
    }

    void Output() {
        System.out.printf("%s %s %.1f", name, date, point);
    }
}

public class J04005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        thiSinh p = new thiSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        p.Output();
    }
}
