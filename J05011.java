import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class gamer {
    int h_in;
    int m_in;
    int h_out;
    int m_out;
    String id;
    String name;
    String time;

    gamer(String id, String name, String in, String out) {
        this.id = id;
        this.name = name;
        this.h_in = Integer.parseInt(in.substring(0, 2));
        this.m_in = Integer.parseInt(in.substring(3, 5));
        this.h_out = Integer.parseInt(out.substring(0, 2));
        this.m_out = Integer.parseInt(out.substring(3, 5));
        this.time = (m_out >= m_in)
                ? (Integer.toString(h_out - h_in) + " gio " + String.format("%d", m_out - m_in) + " phut")
                : (Integer.toString(h_out - h_in - 1) + " gio " + String.format("%d", m_out - m_in + 60) + " phut");
    }

    public String toString() {
        return id + " " + name + " " + time;
    }
}

public class J05011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        gamer a[] = new gamer[n];
        sc.nextLine();
        for (int i = 0; i < n; i++)
            a[i] = new gamer(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        Arrays.sort(a, 0, n, new Comparator<gamer>() {

            @Override
            public int compare(gamer o1, gamer o2) {
                return o2.time.compareTo(o1.time);
            }

        });
        for (int i = 0; i < n; i++)
            System.out.println(a[i]);
    }
}