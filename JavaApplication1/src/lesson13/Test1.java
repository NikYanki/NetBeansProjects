
package lesson13;

public class Test1 {  
}
class Student{
int grade;
public Student(int grade){
this.grade=grade;
}
public static void main(String[] args){
    Student st1=new Student(0);
    switch(st1.grade){
        case 2:
            System.out.println("dvoushnik");
            break;
        case 3:
            System.out.println("troichnik");
            break;
        case 4:
            System.out.println("horosist");
            break;
        case 5:
            System.out.println("otlicnik");
            break;
        default:
                    System.out.println("nekorektnaja ocenka");
        
    }
    }
}
