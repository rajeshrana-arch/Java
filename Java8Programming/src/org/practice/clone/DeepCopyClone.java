package org.practice.clone;
import java.util.ArrayList;
class Department1 implements Cloneable{
    String empId;
    String grade;
    String designation;
    public Department1(String empId, String grade, String designation) {
        this.empId=empId;
        this.grade=grade;
        this.designation=designation;
    }
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Employee1 implements Cloneable{
    int id;
    String name;
    Department1 dept;
    public Employee1(int id, String name, Department1 dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }
    protected Object clone() throws CloneNotSupportedException {
        Employee1 emp = (Employee1) super.clone();
        emp.dept = (Department1) dept.clone();
        return emp;
    }
}

public class DeepCopyClone {
    public static void main(String[] args) {
        ArrayList<Employee1> employees = new ArrayList<Employee1>();
        Department1 dept = new Department1 ("1", "A", "AVP");
        Employee1 emp1 = new Employee1(111, "John", dept);
        Employee1 emp2 = null;
        try {
            emp2 = (Employee1) emp1.clone();
        }
        catch(CloneNotSupportedException clone) {
            System.out.println("Clone Problem is " + clone.getMessage());

        }
        System.out.println(emp1.dept.designation);
        emp2.dept.designation = "Director";
        System.out.println(emp1.dept.designation);
    }
}
