import java.util.Scanner;

public class J01001 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int x, y;
        x = cin.nextInt();
        y = cin.nextInt();
        if (x == 0 || y == 0) {
            System.out.println(0);
        } else {
            System.out.println(2 * (x + y) + " " + x * y);
        }

    }
}