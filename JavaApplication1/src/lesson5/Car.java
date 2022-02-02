
package lesson5;

public class Car {
    String color;
    String engine;
    int speed;
    
    int gaz(int skorost){
    speed += skorost;
    return speed;
    }
    
    int tormoz(int skorost){
    speed -= skorost;
    return speed;
    }
    
    void show_info(){
    System.out.println("cvet: " + color + " motor: " + engine + " skorost: " + speed);
    }
}
    
    class Car_test{
        
    public static void main(String[] args){
       
        Car C1 = new Car();
        C1.color = "white";
        C1.engine = "v8";
        C1.speed = 60;
        
        C1.show_info();
        
        C1.gaz(25);
        
        C1.show_info();
        
        C1.tormoz(85);
        
        C1.show_info();
        
        }
    }
