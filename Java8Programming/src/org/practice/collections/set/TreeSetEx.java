package org.practice.collections.set;
import java.util.*;

public class TreeSetEx {
    public static void main(String[] args) {
        Set<String> ts
                = new TreeSet<String>();
        ts.add("India");
        ts.add("Australia");
        ts.add("South Africa");
        System.out.println("Current TreeSet " + ts);
        ts.add("India");
        ts.remove("Australia");
        System.out.println("Set after removing "
                + "Australia:" + ts);
        System.out.println("Iterating over set:");
        Iterator<String> i = ts.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
}
