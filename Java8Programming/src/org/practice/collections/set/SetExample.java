package org.practice.collections.set;
import java.util.*;

public class SetExample {
    public static void main(String[] args)
    {
        // Set demonstration using HashSet
        Set<String> hash_Set
                = new HashSet<String>();

        hash_Set.add("Geeks");
        hash_Set.add("For");
        hash_Set.add("Geeks");
        hash_Set.add("Example");
        hash_Set.add("Set");
        hash_Set.add(null);
        hash_Set.add(null);

        System.out.println(hash_Set);
    }
}
