
package lesson18array;
import java.util.Arrays;
public class test1 {
    public static void MaxMinValue(int[] array){
    int i =-1;
    System.out.println("vash massiv: ");
    while(i<array.length-1){
    ++i;
    System.out.print((array[i]+" "));
            }
    System.out.println();
    int i1=-1;
    System.out.println("vash otsortirovanyj massiv: ");
    Arrays.sort(array);
    while(i1<array.length-1){
        i1++;
        System.out.print((array[i1]+" "));
    }
        System.out.println();
        System.out.println("maximal: "+ array[array.length-1]);
        System.out.println("minimal: "+ array[0]);
    
            }
    public static void main(String[] args){
        int[] ar1 = {12,3,-5,44,33,32,23,34,56};
        test1.MaxMinValue(ar1);
    
    
    }
    }
