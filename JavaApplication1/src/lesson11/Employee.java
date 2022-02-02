
package lesson11;

public class Employee {
    public double salary;
    public String name;
    public Employee(String name, double salary){
    this.name = name;
    this.salary = salary;
    }
    public double uvelichitel(double salary){
    salary*=2;
    return salary;
    }
    public double uvelichitel(){
    this.salary*=2;
    return salary;
    }
}
    class Test_empoyee{
    public static void main(String[] args){
        Employee emp1 = new Employee("Ivan", 100.55);
        System.out.println(emp1.salary);
        double d = emp1.uvelichitel(emp1.salary);
        System.out.println(emp1.salary);
        System.out.println(d);
        emp1.uvelichitel();
        System.out.println(emp1.salary);
        }
    }

