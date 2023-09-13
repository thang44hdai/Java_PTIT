import java.util.Scanner;

class thiSinh {
    String id;
    String name;
    String date;
    double score;

    thiSinh(int id, String name, String date, double d1, double d2, double d3) {
        this.id = Integer.toString(id);
        this.name = name;
        this.date = date;
        this.score = d1 + d2 + d3;
    }

    public String toString() {
        return this.id + " " + this.name + " " + this.date + " " + this.score;
    }
}

public class J05009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        thiSinh a[] = new thiSinh[n];
        double Max = -1;
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            a[i] = new thiSinh(i + 1, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            Max = Math.max(Max, a[i].score);
        }
        for (thiSinh i : a)
            if (i.score == Max)
                System.out.println(i);
    }
}
