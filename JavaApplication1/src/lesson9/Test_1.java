
package lesson9;

public class Test_1 {
   int a = 1;
   //static int a = 2;
   void abc(int a){
   System.out.println(a);
   System.out.println(this.a);
   }
   public static void main(String[] args){
   Test_1 t = new Test_1();
   t.abc(3);
   }
}
