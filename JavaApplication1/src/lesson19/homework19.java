
package lesson19;
import lesson19.test1; 
public class homework19 {
    public static int[][] abc(int[]...array){
    for(int[]a:array){
        for(int b:a){
        System.out.print(b);
        }
        System.out.println();
    }
    return array;
    }
    public static void main(String[] args){
    
        abc(test1.array);
    }
}
