import java.util.Scanner;

class soPhuc {
    int a, b;

    soPhuc(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public String toString() {
        if (b > 0)
            return a + " + " + b + "i";
        else if (b < 0)
            return a + " - " + Math.abs(b) + "i";
        else
            return Integer.toString(a);
    }
}

public class J04018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            soPhuc a = new soPhuc(sc.nextInt(), sc.nextInt());
            soPhuc b = new soPhuc(sc.nextInt(), sc.nextInt());
            soPhuc ab = new soPhuc(a.a + b.a, a.b + b.b);
            soPhuc c = new soPhuc(ab.a * a.a - ab.b * a.b, ab.a * a.b + ab.b * a.a);
            soPhuc d = new soPhuc(ab.a * ab.a - ab.b * ab.b, 2 * ab.a * ab.b);
            System.out.println(c + ", " + d);
        }
    }
}
