package org.practice.comparator;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

class StudentNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}

class StudentMarksComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.marks > o2.marks)
            return 1;
        return -1;
    }
}

class StudentRollNumberComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.rollNumber > o2.rollNumber)
            return 1;
        return -1;
    }
}

public class Student {
    String name;
    int rollNumber;
    float marks;
    public Student(String name, int rollNumber, float marks) {
        this.name=name;
        this.rollNumber=rollNumber;
        this.marks=marks;
    }
    @Override
    public String toString() {
        return "Name:" + this.name + " RollNumber:" + this.rollNumber + " Marks:" + this.marks;
    }
    public static void printList(ArrayList<Student> al){
        for(Student st: al) {
            System.out.println(st);
        }
    }
    public static void main(String[] args) {
        ArrayList<Student> al= new ArrayList<Student>();
        al.add(new Student("ABB",20, 92.90F));
        al.add(new Student("BCC",5, 94.90F));
        al.add(new Student("XYZ",4, 91.90F));
        al.add(new Student("VNSH",1, 96.90F));
        Collections.sort(al, new StudentRollNumberComparator());
        Student.printList(al);
        System.out.println("----------------------------------");
        Collections.sort(al, new StudentMarksComparator());
        Student.printList(al);
        System.out.println("----------------------------------");
        Collections.sort(al, new StudentNameComparator());
        Student.printList(al);
    }
}
