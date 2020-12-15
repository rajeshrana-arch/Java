package org.practice.collections.map;
import java.util.Map;
import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapExample {
    public static void main(String[] args) {
        Map<String, String> hm = new HashMap<>();
        Map<String, String> ihm = new IdentityHashMap<>();
        hm.put("hmkey","hmvalue");
        hm.put(new String("hmkey"),"hmvalue1");

        ihm.put("ihmkey","ihmvalue");
        ihm.put(new String("ihmkey"),"ihmvalue1");

        System.out.println("Size of HashMap is : "+hm.size() + "Value is " + hm.keySet());
        System.out.println("Size of IdentityHashMap is : "+ihm.size() + hm.keySet());

    }
}
