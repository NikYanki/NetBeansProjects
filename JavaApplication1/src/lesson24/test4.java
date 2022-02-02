package lesson24;

public class test4 {
    public static void main(String[] args) {


        Animal An = new Mouse();
        An.getName();
        An.showNameAnimal();
    }
}
class Animal{
    String getName(){
        return "животное: ";
    }
    void showNameAnimal(){
        System.out.println("животное звать: "+ getName());
    }
}

class Mouse extends Animal{
    String getName(){
        return "животное: ";
    }
    void showNameMouse(){
        System.out.println("животное звать: "+ getName());
    }

}
