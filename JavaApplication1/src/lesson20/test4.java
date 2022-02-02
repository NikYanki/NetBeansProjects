
package lesson20;
import java.util.*;
public class test4 {
    public static void main(String[] args){
    
        String s1 = "one";
        String s2 = "two";
        String s3 = "three";
        String s4 = "four";
        String s5 = "five";
        
        ArrayList<String> list = new ArrayList<>();
        list.add(s5);
        list.add(s4);
        list.add(s3);
        list.add(s2);
        list.add(s1);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
    
}
