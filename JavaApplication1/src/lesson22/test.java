package lesson22;

import java.util.ArrayList;
import java.util.List;

public class test {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        list1.add("one");
        list1.add("two");
        list1.add("three");
        list1.add("four");
        list1.add("five");
        list1.add("six");
        list2.add("one");
        list2.add("two");
        list2.add("three");

        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        //System.out.println(list1.removeAll(list2));
        //System.out.println(list2.removeAll(list1));
        //System.out.println(list1.removeAll(list1));
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println();
        
        //method retainAll
        //list1.retainAll(list2);
        System.out.println("list1: "+list1);
        System.out.println("list2: "+list2);
        
        boolean result =list1.containsAll(list2);
        System.out.println("result: "+ result);
        
        //List l = list1.subList(2, 5);
        //l.add("hello world");
       // System.out.println("l: " + l);
        System.out.println("list1: " + list1);
        
        String[] array1 = list1.toArray(new String[list1.size()]);
        for(String s: array1){
        
            System.out.print(" " +s);
        }
        System.out.println();
    }

}
