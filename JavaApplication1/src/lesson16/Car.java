
package lesson16;

public class Car {
    String color;
    String engine;
    
    Car(String color, String engine){
    this.color=color;
    this.engine=engine;
    }
    
}
class Car_Test {
public static void main(String[] args){
final Car c = new Car("red","v6");
c.color="white";
}
}
