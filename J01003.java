import java.util.Scanner;

public class J01003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        if (x == 0 && y == 0) {
            System.out.println("VSN");
        } else if (x == 0 && y != 0) {
            System.out.println("VN");
        } else {
            System.out.printf("%.2f", -y/x);
        }
        
    }
}
