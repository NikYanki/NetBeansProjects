package lesson20;

import java.util.ArrayList;

public class test2 {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("privet");
        StringBuilder sb2 = new StringBuilder("poka");
        StringBuilder sb3 = new StringBuilder("good");
        StringBuilder sb4 = new StringBuilder("bad");

        ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);
        list.add(sb4);
        for (int i = 0; i < list.size(); i++) {
            list.get(i).append("!!!");

        }
        for (StringBuilder sb : list) {

            System.out.print(sb + " ");
        }
        System.out.println();
        list.remove(1);
        for (StringBuilder sb : list) {

            System.out.print(sb + " ");
        }
    }

}
