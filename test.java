import java.io.File;
import java.io.IOException;
import java.util.*;

public class test {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("test.in"));
        int n = sc.nextInt();   
        sc.nextLine();
        String s = sc.nextLine();
        System.out.println(s);
        System.out.println(n);
        sc = new Scanner(new File("test2.in"));
        s = sc.nextLine();
        System.out.println(s);
    }
}
