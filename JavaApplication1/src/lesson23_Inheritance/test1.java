package lesson23_Inheritance;

public class test1 {
    public static void main(String[] args){
    
        Doctor doc = new Doctor();
        doc.eat();
        doc.sleep();
        doc.treat();
        doc.age=40;
        doc.experiance=15;
        doc.name="Nikolay";
        doc.specialization="hirurg";
        
        Driver d = new Driver();
        d.drive();
        d.eat();
        d.sleep();
        d.age=20;
        d.experiance=3;
        d.name="Volodya";
        d.car="honda";
        
        Techer t = new Techer();
        t.age=30;
        t.experiance=11;
        t.name="Julia";
        t.kolichestvoUchenikov=30;
        t.eat();
        t.sleep();
        t.tech();
    }

}

class Employee {

    String name;
    int age;
    int experiance;

    void eat() {
        System.out.println("kushat");
    }

    void sleep() {
        System.out.println("Spat");
    }

}

class Doctor extends Employee {

    String specialization;

    void treat() {
        System.out.println("lechit");
    }

}

class Techer extends Employee {

    int kolichestvoUchenikov;

    void tech() {
        System.out.println("uchit");
    }

}

class Driver extends Employee {

    String car;

    void drive() {
        System.out.println("vodit");
    }

}
