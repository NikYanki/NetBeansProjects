package lesson20;

import java.util.ArrayList;

public class test1 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("poka");
        list.add("privet");
        list.add("ok");
        list.add(1,"hallo");
        
                    System.out.println(list.get(1));
                    System.out.println(list.set(3, "element"));

        
        for (String s : list) {

            System.out.print(s+" ");
        }
    }
}
