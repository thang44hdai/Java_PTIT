import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Staff implements Comparable<Staff> {

    private String id;
    private String name;
    private String chucVu;
    private String heSoLuong;
    private String soHieu;

    public Staff(String id, String name) {
        this.id = id;
        this.name = name;

        chucVu = id.substring(0, 2);
        heSoLuong = id.substring(2, 4);
        soHieu = id.substring(4);

        checkID();
    }

    private void checkID() {
        if ((chucVu.equals("GD") && Integer.parseInt(soHieu) > 1)
                || (chucVu.equals("TP") && Integer.parseInt(soHieu) > 3)
                || (chucVu.equals("PP") && Integer.parseInt(soHieu) > 3)) {
            chucVu = "NV";
        }
    }

    public boolean isContains(String sub) {
        return name.toLowerCase().contains(sub);
    }

    @Override
    public int compareTo(Staff o) {
        if (this.heSoLuong.compareTo(o.heSoLuong) == 0) {
            return this.soHieu.compareTo(o.soHieu);
        }
        return -this.heSoLuong.compareTo(o.heSoLuong);
    }

    @Override
    public String toString() {
        return name + " " + chucVu + " " + soHieu + " " + heSoLuong;
    }
}

public class test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        List<Staff> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String id = input.substring(0, 7);
            String name = input.substring(8);
            list.add(new Staff(id, name));
        }
        Collections.sort(list);

        int m = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < m; i++) {
            String s = sc.nextLine().toLowerCase();
            for (Staff e : list) {
                if (e.isContains(s)) {
                    System.out.println(e);
                }
            }
            System.out.println("");
        }
    }
}

// 6
// GD08001 Nguyen Kim Loan
// TP05002 Hoang Thanh Tuan
// TP05001 Tran Binh Nguyen
// PP06002 Phan Trung Tuan
// PP06001 Tran Quoc Huy
// NV04003 Vo Van Lan
// 2
// OA
// aN