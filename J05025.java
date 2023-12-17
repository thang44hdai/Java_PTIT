import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class giaoVien {
    String name;
    String mon;
    String id;
    String ten;

    giaoVien(int id, String x, String y) {
        String a[] = x.split(" ");
        this.id = "GV" + ((id <= 9) ? "0" + Integer.toString(id) : Integer.toString(id));
        this.name = x;
        this.ten = a[a.length - 1];
        String b[] = y.split(" ");
        this.mon = "";
        for (String i : b)
            this.mon += Character.toUpperCase(i.charAt(0));
    }

    public String toString() {
        return id + " " + name + " " + mon;
    }
}

public class J05025 {
    public static <T> void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        giaoVien a[] = new giaoVien[n];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            a[i] = new giaoVien(i + 1, sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(a, 0, n, new Comparator<giaoVien>() {
            @Override
            public int compare(giaoVien o1, giaoVien o2) {
                if (!o1.ten.equals(o2.ten))
                    return o1.ten.compareTo(o2.ten);
                return o1.id.compareTo(o2.id);
            }

        });
        for (int i = 0; i < n; i++)
            System.out.println(a[i]);
    }
}
