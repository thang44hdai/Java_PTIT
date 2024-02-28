import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

class xeploai {
    String id;
    String name;
    float tk;
    String xeploai;

    public static String ten(String n) {
        String a[] = n.trim().split("\\s+");
        String s = "";
        for (String i : a)
            s += i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase() + " ";
        return s;
    }

    xeploai(int i, String name, float lt, float th, float dt) {
        this.id = "SV" + String.format("%02d", i);
        this.tk = (float) (lt * 0.25 + th * 0.35 + dt * 0.4);
        if (this.tk >= 8)
            this.xeploai = "GIOI";
        else if (this.tk >= 6.5) {
            this.xeploai = "KHA";
        } else if (this.tk >= 5)
            this.xeploai = "TRUNG BINH";
        else
            this.xeploai = "KEM";
        this.name = ten(name);
    }

    public String toString() {
        return this.id + " " + this.name + String.format("%.2f", this.tk).toString() + " " + this.xeploai;
    }
}

public class J07055 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = sc.nextInt();
        Vector<xeploai> vt = new Vector<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            String x = sc.nextLine();
            float y = sc.nextFloat();
            float z = sc.nextFloat();
            float t = sc.nextFloat();
            vt.add(new xeploai(i, x, y, z, t));
        }
        Collections.sort(vt, new Comparator<xeploai>() {
            @Override
            public int compare(xeploai o1, xeploai o2) {
                if (o1.tk > o2.tk)
                    return -1;
                return 1;
            }

        });
        for (int i = 0; i < n; i++)
            System.out.println(vt.get(i));
            
    }
}
