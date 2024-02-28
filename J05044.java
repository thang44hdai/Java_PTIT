import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

class nv {
    String id;
    String name;
    long phucap;
    long luong;
    long tamung;
    long conlai;
    String cv;

    public static int pc(String a) {
        if (a.equals("GD"))
            return 500;
        if (a.equals("PGD"))
            return 400;
        if (a.equals("TP"))
            return 300;
        if (a.equals("KT"))
            return 250;
        return 100;
    }

    nv(int i, String a, String chucvu, long luong, long ngaycong) {
        this.cv = chucvu;
        this.id = "NV" + String.format("%02d", i);
        this.name = a;
        this.phucap = pc(chucvu);
        this.luong = luong * ngaycong;
        double check = (this.phucap*1.0 + this.luong*1.0) * 2/ 3;
        if (check < 25000) {
            this.tamung = Math.round(check / 1000) * 1000;
        } else {
            this.tamung = 25000;
        }
        this.conlai = this.luong - this.tamung + this.phucap;
    }

    public String toString() {
        return this.id + " " + this.name + " " + this.phucap + " " + this.luong + " " + this.tamung + " " + this.conlai
                + " ";
    }
}

public class J05044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Vector<nv> vt = new Vector<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            vt.add(new nv(i, sc.nextLine().trim(), sc.nextLine().trim(), sc.nextLong(), sc.nextLong()));
        }
        sc.nextLine();
        String check = sc.nextLine();
        for (nv i : vt) {
            if (i.cv.equals(check))
                System.out.println(i);
        }
    }
}
