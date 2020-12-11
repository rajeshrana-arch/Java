package org.practice.collections;

public class StringBuilderEx {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Hello");
        for(int i=0;i<20;i++){
            builder.append("--" + i + "--");
        }
        System.out.println(builder.toString());
    }
}
