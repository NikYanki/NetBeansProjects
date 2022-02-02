
package lesson11;

public class Car {
    String color;
    String engine;
    int dors;
    
    public Car(String color, String engine, int dors){
    this.color = color;
    this.engine = engine;
    this.dors = dors;
    }
    
    public void change_dors(Car c1, int dors){
        c1.dors = dors;
        
    }
    public static void change_color(Car c1, Car c2){
    String color = c1.color;
        c1.color = c2.color;
        c2.color = color;
   
    }
}
class Car_test{
public static void main(String[] args){
Car c1 = new Car("white", "2.2l", 5);
Car c2 = new Car("black", "4.7l", 3);

System.out.println(c1.color);
System.out.println(c1.engine);
System.out.println(c1.dors);
System.out.println(c2.color);
System.out.println(c2.engine);
System.out.println(c2.dors);

Car.change_color(c1, c2);
c1.change_dors(c1,7);
c2.change_dors(c2,6);

System.out.println(c1.color);
System.out.println(c1.engine);
System.out.println(c1.dors);
System.out.println(c2.color);
System.out.println(c2.engine);
System.out.println(c2.dors);
}
}