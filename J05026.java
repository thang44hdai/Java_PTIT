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

public class J05026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, Vector<gv>> mp = new HashMap<>();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            gv a = new gv(i + 1, sc.nextLine(), sc.nextLine());
            if (mp.containsKey(a.mon))
                mp.get(a.mon).add(a);
            else {
                Vector<gv> vt = new Vector<>();
                vt.add(a);
                mp.put(a.mon, vt);
            }
        }
        int q = sc.nextInt();
        sc.nextLine();
        while (q-- > 0) {
            String x = sc.nextLine();
            String a[] = x.split(" ");
            String ans = "";
            for (String i : a)
                ans += Character.toUpperCase(i.charAt(0));
            System.out.println("DANH SACH GIANG VIEN BO MON " + ans + ":");
            for (gv i : mp.get(ans))
                System.out.println(i);
        }
    }
}
