
package lesson23_Inheritance_2;
public class test {
    
    public static void main(String[] args){
    
        dantist doc = new dantist();
        doc.eat();
        doc.sleep();
        doc.treat();
        doc.age=40;
        doc.experiance=15;
        doc.name="Nikolay";
        doc.specialization="dantist";
      
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

    

    void treat() {
        System.out.println("lechit");
    }

}
class dantist extends Doctor{
String specialization;
}