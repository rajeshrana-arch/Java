package org.practice.collections.queue;
import java.util.Queue;
import java.util.PriorityQueue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        Queue<String> queue= new PriorityQueue<>();
        queue.add("C");
        queue.add("A");
        queue.add("D");
        queue.add("E");
        queue.add("B");
        queue.add("F");
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

    }
}
