import java.util.*;

class so {
    long x;
    long y;

    so(long x, long y) {
        this.x = x;
        this.y = y;
    }
}

public class J08011 {
    public static boolean check(String a) {
        for (int i = 1; i < a.length(); i++) {
            if (a.charAt(i) < a.charAt(i - 1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Long, Long> mp = new HashMap<>();
        while (sc.hasNext()) {
            long n = sc.nextLong();
            if (check(Long.toString(n)) == true) {
                if (mp.containsKey(n))
                    mp.put(n, mp.get(n) + 1);
                else
                    mp.put(n, (long) 1);
            }

        }
        Vector<so> vt = new Vector<>();
        for (Long i : mp.keySet()) {
            vt.add(new so(i, mp.get(i)));
        }
        Collections.sort(vt, new Comparator<so>() {

            @Override
            public int compare(so o1, so o2) {
                if (o1.y != o2.y)
                    return (int) (-o1.y + o2.y);
                return -1;
            }

        });
        for (so i : vt)
            System.out.println(i.x + " " + i.y);
    }
}
