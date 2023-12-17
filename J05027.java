import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

class gv {
    String name;
    String id;
    String mon;

    gv(int id, String x, String y) {
        this.id = "GV" + ((id <= 9) ? "0" + Integer.toString(id) : Integer.toString(id));
        this.name = x;
        String a[] = y.split(" ");
        this.mon = "";
        for (String i : a)
            this.mon += Character.toUpperCase(i.charAt(0));
    }

    public String toString() {
        return id + " " + name + " " + mon;
    }
}

public class J05027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, Vector<gv>> mp = new HashMap<>();
        sc.nextLine();
        gv a[] = new gv[n];
        for (int i = 0; i < n; i++) {
            a[i] = new gv(i + 1, sc.nextLine(), sc.nextLine());
        }
        int q = sc.nextInt();
        sc.nextLine();
        while (q-- > 0) {
            String x = sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + x + ":");
            x = x.toLowerCase();
            for (int i = 0; i < n; i++)
                if (a[i].name.toLowerCase().contains(x))
                    System.out.println(a[i]);

        }
    }
}
