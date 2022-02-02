
package lesson9;

public class Test_3 {
   int a = 1;
   static int b = 2;
   void abc(int a){
   System.out.println(b);
   System.out.println(a);
   System.out.println(this.a);
   System.out.println(Test_3.b);
   }
   public static void main(String[] args){
   Test_3 t = new Test_3();
   t.abc(4);
   }
}
