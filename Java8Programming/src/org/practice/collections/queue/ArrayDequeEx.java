package org.practice.collections.queue;
import java.util.Iterator;
import java.util.ArrayDeque;

public class ArrayDequeEx {
    public static void main(String[] args){
        ArrayDeque<String> arrayDeque=new ArrayDeque<>();
        arrayDeque.add("1");
        arrayDeque.add("2");
        arrayDeque.addFirst("5");
        arrayDeque.addFirst("6");
        arrayDeque.offer("9");
        arrayDeque.offerFirst("9");
        arrayDeque.offerLast("9");
        for(String s: arrayDeque){
            System.out.println(s);
        }
        Iterator<String> s= arrayDeque.descendingIterator();
        while(s.hasNext()){
            System.out.println("=="+ s.next());
        }

    }
}
