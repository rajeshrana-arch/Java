package org.practice.collections.list;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListEx {
    public static void main(String[] args){
        ArrayList<String> arrayList= new ArrayList<>();
        arrayList.add("1");
        arrayList.add("1");
        arrayList.add("1");

        Iterator iter = arrayList.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        for(String s:arrayList){
            System.out.println("Simple " + s);
        }
        LinkedList<String> listString= new LinkedList<>();
        listString.add("1");
        listString.add("1");
        listString.add("1");
        for(String s:listString){
            System.out.println("Simple " + s);
        }
        listString.removeAll(arrayList);
        for(String s:listString){
            System.out.println("Simple1 " + s);
        }

    }

}
