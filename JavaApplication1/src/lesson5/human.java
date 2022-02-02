
package lesson5;

public class human {
    String name;
    car3 CAR;
    Bank_account BA;
    void human_information(){
    System.out.println("car color: " + CAR.color + " car engine: " + CAR.engine);
    System.out.println(name + " have: " + BA.balance + " $");
    }
    
}
class human_test{
    public static void main(String[] args){
    human h = new human();
    h.name = "Steve";
    h.CAR =new car3("green", "v10");
    h.BA = new Bank_account(411445, 345.35);
    h.human_information();
    }
}
class car3{
    car3(String c, String e){
    color = c;
    engine = e;
    }
String color;
String engine;

}
class Bank_account{
    Bank_account(int id2, double balance2){
    id = id2;
    balance = balance2;
    }
int id;
double balance;
}