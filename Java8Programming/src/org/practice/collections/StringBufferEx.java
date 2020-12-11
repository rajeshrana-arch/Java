package org.practice.collections;

public class StringBufferEx {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Hello This sample example");
        for(int i=0;i<8;i++) {
            buffer.append("--"+i+"--");
        }
        System.out.println(buffer.toString());
    }
}
