package org.practice.clone;
import java.util.ArrayList;
class Department{
    String empId;
    String grade;
    String designation;
    public Department(String empId, String grade, String designation) {
        this.empId=empId;
        this.grade=grade;
        this.designation=designation;
    }
}
class Employee implements Cloneable{
    int id;
    String name;
    Department dept;
    public Employee(int id, String name, Department dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ShallowCopyClone {
    public static void main(String[] args) {
    ArrayList<Employee> employees = new ArrayList<Employee>();
        Department dept1 = new Department ("1", "A", "AVP");
        Employee emp1 = new Employee (111, "John", dept1);
        Employee emp2 = null;
        try {
            emp2 = (Employee) emp1.clone();
        }
        catch(CloneNotSupportedException clone) {
            System.out.println("Clone Problem is " + clone.getMessage());

        }
        System.out.println(emp1.dept.designation);
        emp2.dept.designation = "Director";
        System.out.println(emp1.dept);
        System.out.println(emp1.dept.designation);
    }
}
