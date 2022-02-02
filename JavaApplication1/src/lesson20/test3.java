package lesson20;

import java.util.*;

public class test3 {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("odin");
        StringBuilder sb2 = new StringBuilder("Dva");
        StringBuilder sb3 = new StringBuilder("Try");
        StringBuilder sb4 = new StringBuilder("Chetyre");

        ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);
        list.add(sb4);
        
        ArrayList<StringBuilder> list4 = new ArrayList<>();
        list4.add(sb1);
        list4.add(sb2);
        list4.add(sb3);
        list4.add(sb4);
        System.out.println(list.toString());

        ArrayList<StringBuilder> list1 = (ArrayList<StringBuilder>) list.clone();

        StringBuilder[] array = {sb1, sb2, sb3};
        List<StringBuilder> l = Arrays.asList(array);
        System.out.println(l);
        //System.out.println(array.toString());  c obyknovennymi massivami toString()
        //rabotaet ne korektno!!!

        //OBRATI VNIMANIE:

       // array[0].append("!!!");
       //System.out.println(l);
       
       //TEPER ZAMENA
       array[0]= new StringBuilder("!!!");
       System.out.println(l);
       
       
       System.out.println(list.equals(list4));
    }
}
