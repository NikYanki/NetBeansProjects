
package lesson6;

public class metod_overloading {
    void show(int i){
    System.out.println(i);
    System.out.println("data type is int");
    System.out.println();
    }
    
    void show(boolean b){
    System.out.println(b);
    System.out.println("data type is boolean");
    System.out.println();
    }
    
    void show(String s){
    System.out.println(s);
    System.out.println("data type is String");
    System.out.println();
    }
    
    void show(int a, int b){
    System.out.println(a + " " + b);
    System.out.println("data type is int(s)");
    System.out.println();   
    }
    
    void show(String a, int b){
    System.out.println(a + " " + b);
    System.out.println("data type is idifferent");
    System.out.println();
    }
    
    void show(int a, String b){
    //System.out.println(a + " " + b);
    System.out.println("kakoy horoshiy dien");
    System.out.println();
    }
}
class metod_overloading_test{
public static void main(String[] args){
    metod_overloading m_o = new metod_overloading();
    int a = 1000;
    m_o.show(a);
    
    String s = "hello world";
    m_o.show(s);
    
    boolean b1 = true;
    m_o.show(b1);
    
    }
}