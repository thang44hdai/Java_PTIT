import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int x = cin.nextInt();
        if (x > 20) {
            System.out.println("ok");
        } else if (x > 40) {
            System.out.println("no OK");
        } else {
            System.out.println("hahaha");
        }

    }
}
