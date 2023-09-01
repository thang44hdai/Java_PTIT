import java.util.*;

public class J04001 {
    static class Point {
        double x;
        double y;

        Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public double distance(Point a) {
            double dx = a.x - this.x;
            double dy = a.y - this.y;
            return Math.sqrt(dx * dx + dy * dy);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Point d1 = new Point(sc.nextDouble(), sc.nextDouble());
            Point d2 = new Point(sc.nextDouble(), sc.nextDouble());
            System.out.printf("%.4f\n", d1.distance(d2));
        }
    }
}

