
package lesson7_homework;

public class employee {
public employee(int i, String s, int a, double sa, String d){
    id = i;
    surname = s;
    age = a;
    salary = sa;
    department = d;
    } 

employee(int i1, String s1, int a1){
    this(i1,s1,a1,0.0,null);
    } 

private employee(String s2){
    this(0,s2,0,0.0,null);
    } 

protected int id;
public String surname;
int age;
private double salary;
String department;    

public void info1(){
System.out.println(age);
}

public void info2(){
System.out.println(id);
}

public void info3(){
System.out.println(surname);
}
}
class employee_test{
public static void main(String[] args){
employee em1 = new employee(1,"Volodya",1);
em1.info1();
em1.info2();
em1.info3();
    }
}