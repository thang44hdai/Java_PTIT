import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.Scanner;

class sv {
    private String id, name, lop, email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setName(String name) {
        String a[] = name.trim().split("\\s+");
        this.name = "";
        for (String i : a) {
            this.name += i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase() + " ";
        }
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String toString() {
        return id + " " + name + lop + " " + email;
    }

    sv(String id, String name, String lop, String email) {
        setId(id);
        setEmail(email);
        setLop(lop);
        setName(name);
    }
}

public class J07033 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = sc.nextInt();
        sv a[] = new sv[n];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            a[i] = new sv(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(a, new Comparator<sv>() {

            @Override
            public int compare(sv o1, sv o2) {
                return o1.getId().compareTo(o2.getId());
            }
            
        });
        for (sv sv : a) {
            System.out.println(sv);
        }

    }
}
