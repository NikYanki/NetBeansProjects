
package lesson22;

import java.util.HashMap;
import java.util.Map;

public class test1 {
    public static void main(String[] args){
    
        Map<Integer, String> map =new HashMap<>();
        map.put(777, "Smirnov Nikolay");
        map.put(778, "Yankova Julija");
        map.put(779, "Vill Smitt");
        map.put(780, "Backham David");
        map.put(781, "Yankoviy Mykola");
        map.remove(779);
        System.out.println("map: "+ map);
    }
}
