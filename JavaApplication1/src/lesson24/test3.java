package lesson24;

public class test3 {
    public static void main(String[] args) {
        Employee Emp1 = new Doctor();
        Employee Emp = new Employee();
        Doctor D = new Doctor();
        //Emp.sleep();
        //Emp1.sleep();
       // D.sleep();
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
    @Override
    void sleep() {

        System.out.println("доктор спит");
    }
    void eat() {
        System.out.println("доктор кушает"); // overriding method
    }
}