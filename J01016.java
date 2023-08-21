import java.util.Scanner;

public class J01016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '4' || s.charAt(i) == '7')
                cnt++;
        }
        if (cnt == 4 || cnt == 7)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
