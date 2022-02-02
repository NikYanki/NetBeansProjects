
package lesson6;

import lesson5.Employee;

public class employee {
private employee(int i, String s, int a, double sa, String d){
    id = i;
    surname = s;
    age = a;
    salary = sa;
    department = d;
    } 

public employee(String s, int a){
    surname = s;
    age = a;
    } 

protected employee(int i, String s, int a){
    id = i;
    surname = s;
    age = a;
    } 

int id;
String surname;
int age;
double salary;
String department;

    public employee() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

class employee_test{
    
public static void main(String[] args){
    
employee emp = new employee("Ivanov", 25);

employee emp1 = new employee(12, "Petrov", 30);

System.out.println(emp.surname);
System.out.println(emp1.surname);

//employee emp2 =new employee(247884, "Filipova", 29, 2700.50, "Protect");

//System.out.println(emp2.surname);
    }
}