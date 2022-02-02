package lesson23_Inheritance_2;

public class test1 {

}

class Human {
    Human(){}
Human(String name, String s){
this.name=name;
surname=s;
}
Human(String name){
this(name, null);
}
    String name;
    String surname;

}
class Student extends Human{
Student(){
super("Mykola","Yankovyi");
}
    public static void main(String[] args){
    Student st = new Student();
    }
}