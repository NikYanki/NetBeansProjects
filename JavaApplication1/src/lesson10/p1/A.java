/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson10.p1;

/**
 *
 * @author nikolajankovoj
 */
//class car
 public class A {
    String color;
    String engine;
    double max_speed;
    public void show_info(String c, String e, double m){
        color = c;
        engine = e;
        max_speed = m;
        System.out.println("cvet mashyny: " + color + " molor: " + engine + " maximalnaya skorost: "+ max_speed);
    }
     public static void main(String[] args) {
       A car = new A();
       car.show_info("white", "w12", 315.50); 
    }
}
