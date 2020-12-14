package org.practice.generics;

import java.util.HashSet;
import java.util.Set;

class Employee<T1, T2, T3>{
    T1 rollNumber;
    T2 marks;
    T3 name;
    public Employee(T1 rollNumber, T2 marks, T3 name){
        this.rollNumber=rollNumber;
        this.marks=marks;
        this. name=name;
    }
    public T1 getRollNumber(){
        return this.rollNumber;
    }
    public T2 getMarks() {
        return this.marks;
    }
    public T3 getName() {
        return this.name;
    }
    @Override
    public String toString() {
        return "Name|"+ this.name + " RollNumber|" + this.rollNumber + " Marks" + this.marks;
    }
}
class Dept<T1, T2,T3>{
    T1 deptNumber;
    T2 deptName;
    T3 employee;
    public Dept(T1 deptNumber, T2 deptName, T3 employee) {
        this.deptNumber=deptNumber;
        this.deptName=deptName;
        this.employee=employee;
    }
    @Override
    public String toString(){
        return "Dept Number|" + this.deptNumber + " Dept Name |" +this.deptName + " Employee" + this.employee;
    }
}
public class EmployeeEx {
    public static void main(String[] args) {
        Employee<Integer, Float, String> emp = new Employee<>(10,10.90f, "Rana");
        System.out.println(emp);
        Dept<Integer,String, Employee> dept= new Dept<>(1, "SAP", emp);
        System.out.println(dept);
        Set<String> set1 = new HashSet<>();
        set1.add("H1");
        set1.add("H2");
        set1.add("H3");
        set1.add("H4");
        Set<String> set2 = new HashSet<>();
        set1.add("H1");
        set1.add("H5");
        set1.add("H6");
        set1.add("H7");
        Set<String> result = unionAll(set1, set2);
        for(String str:result){
            System.out.println(str);
        }
    }
    public static <E> Set<E> unionAll(Set<E> set1, Set<E> set2) {
        Set<E> data= new HashSet<>(set1);
        data.addAll(set2);
        return data;
    }
}
