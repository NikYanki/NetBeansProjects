package lesson10.p4;
import lesson10.p1.A;
import static lesson10.p1.p2.B.*;
import static lesson10.p1.p2.B.wages;
import lesson10.p1.p2.p3.*;
import lesson10.p4.p5.E;

//human
public class D {
    public static void main(String[] args) {
        String name = "Nikolay";
        String surname = "Yankovyi";

        nachislenie(19.85);

        E Bank_accout = new E();
        Bank_accout.id =324999;
        Bank_accout.name = name;
        Bank_accout.surname = surname;
        Bank_accout.count = wages * 3;

        A car = new A();
        car.show_info("Gray", "2.4 l.", 280.55);
        C house = new C();
        house.show_info();
        System.out.println(Bank_accout.name);
        System.out.println(Bank_accout.surname);
        System.out.println("My wages: "+wages);

        System.out.println(Bank_accout.count);


    }
}
