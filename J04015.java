import java.util.*;

class GV {
    String id;
    String name;
    int bacLuong;
    int phuCap;
    int thuNhap;

    GV(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.bacLuong = Integer.parseInt(id.substring(2));
        switch (id.substring(0, 2)) {
            case "HT":
                this.phuCap = 2000000;
                break;
            case "HP":
                this.phuCap = 900000;
                break;
            case "GV":
                this.phuCap = 500000;
                break;
        }
        this.thuNhap = salary * this.bacLuong + this.phuCap;
    }

    public String toString() {
        return this.id + " " + this.name + " " + this.bacLuong + " " + this.phuCap + " " + this.thuNhap;
    }
}

public class J04015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GV p = new GV(sc.nextLine(), sc.nextLine(), sc.nextInt());
        System.out.println(p);
    }
}
