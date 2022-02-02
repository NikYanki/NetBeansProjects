package lesson23_Inheritance_2;

public class human {
//public human(String name){
//this.name=name;
//}
    protected String name;
    protected static int salary = 150;
    protected void work() {
        System.out.println("rabotat");
    }
    protected static void rest() {
        System.out.println("otduhat");
    }

}
class student extends human{
    public static void main(String[] args){
    student st = new student();
    System.out.println(student.salary);
    System.out.println(st.name);
    st.work();
    student.rest();
    }

}