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

public class J04010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Point x, y, z;
            x = new Point(sc.nextDouble(), sc.nextDouble());
            y = new Point(sc.nextDouble(), sc.nextDouble());
            z = new Point(sc.nextDouble(), sc.nextDouble());
            double d1, d2, d3;
            d1 = x.distance(y);
            d2 = x.distance(z);
            d3 = y.distance(z);
            if (d1 + d2 > d3 && d1 + d3 > d2 && d2 + d3 > d1) {
                double S = 1.0 / 4 * Math.sqrt((d1 + d2 + d3) * (d1 + d2 - d3) * (d1 + d3 - d2) * (d2 + d3 - d1));
                double R = d1 * d2 * d3 / (4 * S);
                System.out.printf("%.3f\n", Math.PI * R * R);
            } else {
                System.out.println("INVALID");
            }
        }
    }
}
