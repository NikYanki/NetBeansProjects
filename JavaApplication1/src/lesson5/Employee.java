
package lesson5;

public class Employee {
Employee(int i, String s, int a, double sa, String d){
    id = i;
    surname = s;
    age = a;
    salary = sa;
    department = d;
    }    
int id;
String surname;
int age;
double salary;
String department;

double uvelichenie_zarplaty(){
salary *= 2;
return salary;
    }
}
class Employee_test{
public static void main(String[] args){
    Employee man =new Employee(247884, "Filipov", 29, 2700.50, "Protect");
    Employee woman =new Employee(592504, "Frolova", 25, 2450.90, "Finance");
    
    man.uvelichenie_zarplaty();
    System.out.println("New Filipov salary: " + man.salary);
    
    woman.uvelichenie_zarplaty();
    System.out.println("New Frolova salary: " + woman.salary);
    }
}
