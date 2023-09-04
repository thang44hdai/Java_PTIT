import java.util.Scanner;

class thiSinh {
    String id;
    String name;
    String diemUT;
    double tongDiem;
    String IntongDiem;
    double total;
    String state;

    thiSinh(String id, String name, double toan, double li, double hoa) {
        this.id = id;
        this.name = name;
        this.tongDiem = toan * 2 + li + hoa;
        String x = id.substring(0, 3);
        switch (x) {
            case "KV1":
                this.total = this.tongDiem + 0.5;
                this.diemUT = String.format("%.1f", 0.5);
                break;
            case "KV2":
                this.total = this.tongDiem + 1.0;
                this.diemUT = "1";
                break;
            case "KV3":
                this.total = this.tongDiem + 2.5;
                this.diemUT = String.format("%.1f", 2.5);
                break;
        }
        this.state = this.total >= 24 ? "TRUNG TUYEN" : "TRUOT";
        this.IntongDiem = (int) this.tongDiem == this.tongDiem ? String.format("%.0f", this.tongDiem)
                : String.format("%.1f", this.tongDiem);
    }

    public void Output() {
        System.out.printf("%s %s %s %s %s", id, name, diemUT, IntongDiem, state);
    }
}

public class J04013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        thiSinh p = new thiSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        p.Output();
    }
}
