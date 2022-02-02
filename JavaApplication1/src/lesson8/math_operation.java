
package lesson8;

public class math_operation {
    
   static int operation(int a, int b, int c){
   int result = a*b*c;
   //System.out.println(result);
   return result;
    } 
   static void operation(int a1, int a2){
   System.out.println("chastka: " + (a1/a2) + " ostatok: " + (a1%a2));
    }
}
class math_operation_test {
    
public static void main(String[] args){
    
System.out.println(math_operation.operation(12, 13, 15));
math_operation.operation(12456, 21);
System.out.println(math_operation.operation(2, 3, 5));
math_operation.operation(120, 13);
   }
}
