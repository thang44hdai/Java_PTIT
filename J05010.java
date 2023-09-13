import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class matHang {
    String name;
    String id;
    double profit;
    String type;
    double gia_mua;
    double gia_ban;

    matHang(int id, String name, String type, double gia_mua, double gia_ban) {
        this.id = Integer.toString(id);
        this.name = name;
        this.type = type;
        this.gia_ban = gia_ban;
        this.gia_mua = gia_mua;
        this.profit = gia_ban - gia_mua;
    }

    public String toString() {
        return id + " " + name + " " + type + " " + String.format("%.2f", profit);
    }
}

public class J05010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        matHang a[] = new matHang[n];
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            a[i - 1] = new matHang(i, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
        }
        Arrays.sort(a, 0, n, new Comparator<matHang>() {

            @Override
            public int compare(matHang o1, matHang o2) {
                return o1.profit > o2.profit ? -1 : 1;
            }

        });
        for (int i = 0; i < n; i++)
            System.out.println(a[i]);
    }
}
