package org.practice.threads;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSafeEx {
    //public volatile int count=0;
    AtomicInteger count = new AtomicInteger(0);
    public int increment(){
        return count.getAndIncrement();
        //return count;
    }
    /**    public synchronized int increment(){
    //        //return count.getAndIncrement();
    //        return count++;
      }
     **/
public int getCount(){
        return count.get();
    }
    public static void main(String[] args) throws Exception{
        ThreadSafeEx threadSafeEx = new ThreadSafeEx();
        Thread t1= new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1; i<=1000; i++) {
                    threadSafeEx.increment();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1; i<=1000; i++) {
                    threadSafeEx.increment();
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(threadSafeEx.getCount());
    }
}
