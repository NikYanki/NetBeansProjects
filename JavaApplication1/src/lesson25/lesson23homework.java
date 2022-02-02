package lesson25;

public class lesson23homework {
    public static void main(String[] args) {
        Mechenosec mec = new Mechenosec("Цезарь");
        mec.swim();
        mec.eat();
        mec.sleep();

        Speakable pin = new Pingvin("Косолапик");
        pin.speak();

        Animal lev1 = new Lev("Лёва");
        lev1.sleep();
        lev1.eat();

        Mammal lev2 = new Lev("Алекс");
        lev2.run();
        lev2.sleep();
        lev2.speak();
        lev2.eat();
    }
}
abstract class Animal{
    protected String name;

    Animal(String name){
        this.name=name;
    }
    abstract void eat();
    abstract void sleep();
}
abstract class Fish extends Animal{
    Fish(String name){
        super(name);
        this.name = name;
    }
    void sleep(){
        System.out.println("Всегда интересно наблюдать как спят рыбы");
    }
    abstract void swim();
}
abstract class Bird extends Animal implements Speakable{
    Bird(String name){
        super(name);
        this.name=name;
    }
    abstract void fly();
    public void speak(){
        System.out.println(name+"поют");
    }
}
abstract class Mammal extends Animal implements Speakable{
    Mammal(String name){
        super(name);
        this.name=name;
    }
    abstract void run();
}
interface Speakable{
    default void speak(){
        System.out.println("Некоторые говорят");
    }
}
class Mechenosec extends Fish{
    Mechenosec(String name){
        super(name);
        this.name=name;
    }
    void swim(){
        System.out.println("Меченосец красивая рыбка которая быстро плавает!");
    }
    void eat(){
        System.out.println("Меченосец нк хищная рыба и ест обычный рыбий корм");
    }
}
class Pingvin extends Bird{
    Pingvin(String name){
        super(name);
        this.name = name;
    }
    void eat(){
        System.out.println("Пингвин любит есть рыбу");
    }
    void sleep(){
        System.out.println("Пингвины спят прижавшись друг к другу");
    }
    void fly() {
      System.out.println("Пингвины не умеют летать");
    }
    public void speak(){
        System.out.println("Пингвины не умеют петь как соловьи");
    }
}
class Lev extends Mammal{
    Lev(String name){
        super(name);
        this.name = name;
    }
    void eat(){
        System.out.println("Лев как любой хищник любит мясо");
    }
    void sleep(){
        System.out.println("Большую часть дня лев спит!");
    }
    void run(){
        System.out.println("Лев это не самая быстрая кошка!");
    }
}
