import java.util.*;

class thiSinh {
    String name;
    String date;
    String gioiTinh;
    String address;
    String id;
    String dateRegister;

    thiSinh(String name, String gioiTinh, String date, String address, String id, String dateRegister) {
        this.name = name;
        this.gioiTinh = gioiTinh;
        this.date = date;
        this.address = address;
        this.id = id;
        this.dateRegister = dateRegister;
    }

    void Output() {
        System.out.printf("00001 %s %s %s %s %s %s", name, gioiTinh, date, address, id, dateRegister);
    }
}

public class J04007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        thiSinh p = new thiSinh(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        p.Output();
    }
}
