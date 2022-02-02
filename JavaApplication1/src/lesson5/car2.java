
package lesson5;

public class car2 {
    car2(String cvet, String motor){
        color = cvet;
        engine = motor;
        System.out.println("motor mashiny: " + engine + "cvet mashiny: " + color);
    }
    String color;
    String engine;
}
class car2_test{
public static void main(String[] args){
    car2 c1 = new car2("white", "v10");
    car2 c2 = new car2("blask", "v8");
    }
}
