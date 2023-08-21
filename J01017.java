import java.util.Scanner;

public class J01017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String space = sc.nextLine();
        while (t-- > 0) {
            String n = sc.nextLine();
            int len = n.length();
            boolean check = true;
            for (int i = 0; i < len - 1; i++) {
                int x = (int) n.charAt(i);
                int y = (int) n.charAt(i + 1);
                if (Math.abs(x - y) != 1) {
                    check = false;
                    break;
                }
            }
            System.out.println(check == true ? "YES" : "NO");
        }
    }
}
