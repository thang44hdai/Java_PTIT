import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class J01025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1, y1, x2, y2, x3, y3, x4, y4;
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        x3 = sc.nextInt();
        y3 = sc.nextInt();
        x4 = sc.nextInt();
        y4 = sc.nextInt();
        int[] a = { x1, x2, x3, x4 };
        int[] b = { y1, y2, y3, y4 };
        Arrays.sort(a);
        Arrays.sort(b);
        int tmp = Math.max(a[3] - a[0], b[3] - b[0]);
        System.out.println(tmp * tmp);

    }
}
