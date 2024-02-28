import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

import java.io.*;

// test/Pair.java
// package test;
public class Pair implements Serializable, Comparable<Pair> {
    private int first, second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    public int compareTo(Pair o) {
        return this.first - o.first;
    }

    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}

public class J07041 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> vt = (ArrayList<Pair>) sc.readObject();
        HashSet<String> st = new HashSet<>();
        for (Pair i : vt) {
            if (i.getFirst() < i.getSecond() && !st.contains(i.toString())) {
                st.add(i.toString());
                vt.add(i);
            }
        }
        Collections.sort(vt);
    }
}
