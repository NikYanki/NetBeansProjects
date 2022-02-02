package lesson24;

public class test2 {
    void abc(animal an){
        System.out.println("an");
    }
    void abc(mouse ms){
        System.out.println("ms");
    }

    public static void main(String[] args) {
        animal an1 = new mouse();
        test2 ts1 = new test2();
        ts1.abc(an1);// здесь an1 используется как простая переменная compile time binding
        an1.getName();// здесь используется run time binding
    }
}
class animal{
    void getName(){
        System.out.println("animal");
    }
}
class mouse extends animal{
    void getName(){
        System.out.println("mouse");
    }
}
