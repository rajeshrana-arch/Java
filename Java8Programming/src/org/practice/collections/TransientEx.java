package org.practice.collections;

import java.io.*;

class Student implements Serializable {
    String name, address;
    transient String accessKey;
    transient int age;
    public Student(String accessKey, int age,String name, String address)
    {
        this.accessKey = accessKey;
        this.age = age;
        this.name = name;
        this.address = address;
    }
}
public class TransientEx {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        ObjectInputStream in
                = new ObjectInputStream(
                (new FileInputStream(
                        "login_details.txt")));
    }
}
