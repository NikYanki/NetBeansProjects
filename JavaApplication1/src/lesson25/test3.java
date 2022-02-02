package lesson25;

public class test3 {
    public static void main(String[] args) {
    jumpble j1 = new human();
    jumpble j2 = new animal();
    j1.jump();
    j2.jump();
    j2.fjy();
    }
}
interface jumpble{
    void jump();
    default void fjy(){
        System.out.println("некоторые животные умеют летать");
    }
}

class human implements jumpble{
    public void jump(){
        System.out.println("человек прыгает");
    }
}
class animal implements jumpble {
    public void jump() {
        System.out.println("животное пригает");
    }
}