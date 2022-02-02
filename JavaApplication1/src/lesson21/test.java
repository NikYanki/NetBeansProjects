
package lesson21;
import java.util.Arrays;
public class test {
    public static void main(String[] args){
    
        int[] array = {1,2,3,4,5};
        int[] array1 = {1,2,3,5,};
        char[]array2 = {'p','r','i','v','e','t'};
        char[]array3 = {'p','r','i','v','i','v','k','a'};
        
        String s = new String(array3);
        
        System.out.println(s);
        System.out.println();
        System.out.println("method compare");
        System.out.println();
        System.out.println(Arrays.compare(array, array1));
        System.out.println(Arrays.compare(array1, array1));
        System.out.println(Arrays.compare(array1, array));
        System.out.println();
        System.out.println(Arrays.compare(array2, array2));
        System.out.println(Arrays.compare(array2, array3));
        System.out.println(Arrays.compare(array3, array2));
        System.out.println();
        System.out.println("method mismatch");
        System.out.println();
        System.out.println(Arrays.mismatch(array, array1));
        System.out.println(Arrays.mismatch(array1, array1));
        System.out.println(Arrays.mismatch(array1, array));
        System.out.println();
        System.out.println(Arrays.mismatch(array2, array3));
        System.out.println(Arrays.mismatch(array2, array2));
        System.out.println(Arrays.mismatch(array3, array2));
        
        
    }
    
    
}
