package lesson23_Inheritance;

public class test {
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
    //String name;
    //int age;
    // int experiance;

    String specialization;
    //void eat(){
    //System.out.println("kushat");
    //}
    //void sleep(){
    //System.out.println("Spat");
    //}

    void treat() {
        System.out.println("lechit");
    }

}

class techer extends employee{

    //String name;
    //int age;
    //int experiance;
    int kolichestvoUchenikov;

    //void eat() {
    //    System.out.println("kushat");
    //}

    //void sleep() {
    //    System.out.println("Spat");
    //}

    void tech() {
        System.out.println("uchit");
    }

}

class driver extends employee{

    //String name;
    //int age;
    //int experiance;
    String car;

    //void eat() {
    //    System.out.println("kushat");
    //}

    //void sleep() {
    //    System.out.println("Spat");
    //}

    void drive() {
        System.out.println("vodit");
    }

}
