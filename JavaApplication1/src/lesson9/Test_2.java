
package lesson9;

public class Test_2 {
    int a = 1;
    static int b = 2;
    
    static void abc(final int a){
    System.out.println(a);
    System.out.println(Test_2.b);
    }
    public static void main(String[] args){
    abc(5);
    }
}
