package org.practice.collections.map;

import java.util.WeakHashMap;
class Demo {
    private String name;
    private int rollNumber;
    public Demo(String name, int rollNumber) {
        this.name=name;
        this.rollNumber=rollNumber;
    }
    public String toString() {
        return "Demo";
    }
    public void finalize() {
        System.out.println("Finalize method is called");
    }

}

public class WeakHashMapEx {
    public static void main(String[] args) throws InterruptedException {
        Demo dd=new Demo("Rana", 20);
        WeakHashMap<Demo, String> map= new WeakHashMap<>();
        map.put(dd, "Hello");
        dd=null;
        System.gc();
        Thread.sleep(4000);
        System.out.println(map);
    }
}
