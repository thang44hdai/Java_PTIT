import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class time {
    int h, m, s;

    time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }
}

public class J05033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        time a[] = new time[n];
        for (int i = 0; i < n; i++)
            a[i] = new time(sc.nextInt(), sc.nextInt(), sc.nextInt());
        Arrays.sort(a, 0, n, new Comparator<time>() {
            public int compare(time a, time b) {
                if (a.h == b.h) {
                    if (a.m == b.m) {
                        return a.s > b.s ? 1 : -1;
                    } else
                        return a.m > b.m ? 1 : -1;
                } else
                    return a.h > b.h ? 1 : -1;
            }
        });
        for (time i : a) {
            System.out.println(i.h + " " + i.m + " " + i.s);
        }
    }
}
