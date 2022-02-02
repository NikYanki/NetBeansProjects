
package lesson24;

public class test1 {
    public static void main(String[] args) {
        doctor d = new doctor();
        employee emp1 = new employee();
        employee emp2 = new doctor();
        employee emp3 = new techer();//можно создавать обьекты родитерьского класса
        d.eat();
    }
}
class eda{}
class frukty extends eda{}
class employee {
    String name;
    int age;
    int experiance;
    eda eat() {
        System.out.println("kushat");
        eda e = new eda();
        return e;
    }
    void sleep() {
        System.out.println("Spat");
    }
}
class doctor extends employee {
    String specialization;

    void treat() {
        System.out.println("lechit");
    }

    frukty eat() {
        System.out.println("доктор кушает"); // overriding method
        frukty fr = new frukty();
        return fr;
    }
}

class techer extends employee {
    int kolichestvoUchenikov;
    void tech() {
        System.out.println("uchit");
    }
}
class driver extends employee {
    String car;
    void drive() {
        System.out.println("vodit");
    }

}
