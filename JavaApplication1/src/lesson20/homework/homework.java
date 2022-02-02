package lesson20.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class homework {
    
    public static ArrayList<String> abc(String... array) {
        
        System.out.println("Vash massiv imeet cleduuchiy vid: ");
        for (String s : array) {
            
            System.out.print(s + " ");
        }
        System.out.println();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            
            list.add(array[i]);
        }
        Collections.sort(list);
        System.out.println(list);
        return list;
    }
    public static void main(String[] args){
    
        abc("z","f","a");
    }
    
}
