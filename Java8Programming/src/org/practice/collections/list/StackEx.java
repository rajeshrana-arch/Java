package org.practice.collections.list;
import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<String> stack= new Stack<>();
        stack.push("Hello");
        stack.push("hii");
        System.out.println(stack.peek());
        for(String s: stack) {
            System.out.println(s);
        }
        System.out.println(stack.pop());
    }
}
