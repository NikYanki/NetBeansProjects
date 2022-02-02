
package lesson8;

public class student {
    String name;
    int course;
    static int count;
    public student(String name2, int course2) {
    count++;
    name = name2;
    course = course2;
    System.out.println("Student nomer: " + count + " sozdan");
    }
    public static void info(){
        System.out.println("Vsego sozdano studentov:  " + count);

    }
}
class student_test{
public static void main(String[] args){
    student st1 = new student("Ivan", 1);
    student st2 = new student("Maria", 2);
    student st3 = new student("viktor", 3);
    student.info();
}
}