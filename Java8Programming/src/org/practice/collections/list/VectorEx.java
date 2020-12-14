package org.practice.collections.list;
import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        Vector<String> vector= new Vector<>();
        vector.add("Hello");
        vector.add("Hii");
        vector.add("Opps");
        for(String s:vector) {
            System.out.println(s);
        }
    }
}
