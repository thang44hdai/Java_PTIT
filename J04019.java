import java.util.Scanner;

class Point {
    double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static Point nextPoint(Scanner sc) {
        return new Point(sc.nextDouble(), sc.nextDouble());
    }
}

class Triangle {
    Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean valid() {
        double dx = Math.sqrt(Math.pow(a.x - b.x, 2.0) + Math.pow(a.y - b.y, 2.0));
        double dy = Math.sqrt(Math.pow(a.x - c.x, 2.0) + Math.pow(a.y - c.y, 2.0));
        double dz = Math.sqrt(Math.pow(c.x - b.x, 2.0) + Math.pow(c.y - b.y, 2.0));
        if (dx + dy > dz && dy + dz > dx && dx + dz > dy)
            return true;
        return false;
    }

    public String getPerimeter() {
        double dx = Math.sqrt(Math.pow(a.x - b.x, 2.0) + Math.pow(a.y - b.y, 2.0));
        double dy = Math.sqrt(Math.pow(a.x - c.x, 2.0) + Math.pow(a.y - c.y, 2.0));
        double dz = Math.sqrt(Math.pow(c.x - b.x, 2.0) + Math.pow(c.y - b.y, 2.0));
        return String.format("%.3f", dx + dy + dz);
    }

}

public class J04019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if (!a.valid()) {
                System.out.println("INVALID");
            } else {
                System.out.println(a.getPerimeter());
            }
        }
    }
}
