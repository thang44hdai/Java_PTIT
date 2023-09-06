import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

class hangHoa {
    String id;
    String name;
    String don_vi_tinh;
    int gia_mua;
    int gia_ban;
    int profit;

    hangHoa(int id, String name, String do_vi_tinh, int x, int y) {
        this.id = (id <= 9) ? "MH00" + Integer.toString(id) : "MH0" + Integer.toString(id);
        this.name = name;
        this.don_vi_tinh = do_vi_tinh;
        this.gia_mua = x;
        this.gia_ban = y;
        this.profit = y - x;
    }

    public String toString() {
        return id + " " + name + " " + don_vi_tinh + " " + gia_mua + " " + gia_ban + " " + profit;
    }
}

public class J05081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Vector<hangHoa> vt = new Vector<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            vt.add(new hangHoa(i, sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        vt.sort(new Comparator<hangHoa>() {
            public int compare(hangHoa a, hangHoa b) {
                if (a.profit != b.profit)
                    return a.profit > b.profit ? -1 : 1;
                else
                    return a.id.compareTo(b.id);

            }
        });
        for(int i=0;i<n;i++)
            System.out.println(vt.get(i));
    }
}
