import java.util.*;

class Point {
    double x;
    double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point a) {
        double dx = a.x - this.x;
        double dy = a.y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}

public class J04008 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Point d1 = new Point(sc.nextDouble(), sc.nextDouble());
            Point d2 = new Point(sc.nextDouble(), sc.nextDouble());
            Point d3 = new Point(sc.nextDouble(), sc.nextDouble());
            double a, b, c;
            a = d1.distance(d2);
            b = d1.distance(d3);
            c = d2.distance(d3);
            if (a + b <= c || a + c <= b || b + c <= a) {
                System.out.println("INVALID");
            } else {
                System.out.printf("%.3f\n", a + b + c);
            }
        }
    }
}
