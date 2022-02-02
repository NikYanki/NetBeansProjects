package lesson25;
public class test2 {
}
class employee {
    String name;
    int age;
    int experiance;
    void eat() {
        System.out.println("kushat");
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
}
class techer extends employee implements helpAble {
    int kolichestvoUchenikov;
    void tech() {
        System.out.println("uchit");
    }
    public void pomoshc(){System.out.println("Учитель помакает");}
    public void tushitPozar(){System.out.println("Учитель тушит пожар"); };
}
class driver extends employee implements helpAble, swimAble{
    String car;
    void drive() {
        System.out.println("Водит");
    }
    public void pomoshc(){System.out.println("Водитель помакает");}
    public void tushitPozar(){System.out.println("Водитель тушит пожар"); };
    public void plavat(){System.out.println("Водитель умеет плавать");}
}
interface swimAble{
void plavat();
}
interface helpAble{
    void pomoshc();
    void tushitPozar();
}