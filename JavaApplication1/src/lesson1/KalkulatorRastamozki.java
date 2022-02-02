
package lesson1;
import java.util.Scanner;
public class KalkulatorRastamozki {
    static Scanner scanner = new Scanner(System.in);
    static Scanner scanner1 = new Scanner(System.in);
    static Scanner scanner2 = new Scanner(System.in);
    static Scanner scanner3 = new Scanner(System.in);
 
    public static void main(String[] args) {
        int num1 = getInt1();//цена машины
        int num2 = getInt2();//объем двигателя
        int num3 = getInt3();//тип двигателя
        int num4 = getInt4();//возраст ватомобиля
        double result = calc(num1,num2, num3, num4);
        int posh = num1/10;
        double pdv = (num1 + result + posh)*0.2;
        double total = (result+pdv+posh+num1);
        System.out.println("Всего платежей: "+(result+pdv+posh));
        System.out.println("Акцыз: "+result);
        System.out.println("ПДВ: "+pdv);
        System.out.println("Пошленна: "+posh);
        System.out.println("Пенсионный фонд: "+total*0.01);
        System.out.println("Цена с растаможкой: "+(total+total*0.01));
    }
 
    public static int getInt1(){
        System.out.println("Введите стоимость т/с в $:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе. Попробуйте еще раз.");
            scanner.next();
            num = getInt1();
        }
        return num;
    }
    public static int getInt2(){
        System.out.println("Введите объем двигателя т/с в смˆ2:");
        int num;
        if(scanner1.hasNextInt()){
            num = scanner1.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе. Попробуйте еще раз.");
            scanner1.next();
            num = getInt2();
        }
        return num;
    }
    public static int getInt3(){
        System.out.println("Введите тип двигателя, для бензинового введите 1, для дизельнлго введите 2 т/с:");
        int num;
        if(scanner2.hasNextInt()){
            num = scanner2.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе. Попробуйте еще раз.");
            scanner2.next();
            num = getInt3();
        }
        return num;
    }
    public static int getInt4(){
        System.out.println("Введите возраст т/с:");
        int num;
        if(scanner3.hasNextInt()){
            num = scanner3.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе. Попробуйте еще раз.");
            scanner3.next();
            num = getInt4();
        }
        return num;
    }

    public static double calc(int num1, int num2, int num3, int num4){
        int Kd = 0;
        double akcyz;
        double koef$= 1.13;
        if(num3==1 && num2<3000)
            Kd=50;
        if (num3==1 && num2>=3000)
            Kd=100;
        if (num3==2 && num2<3500)
            Kd=75;
        if (num3==2 && num2>=3500)
            Kd=150;
        double age = num4;
        double v = num2;
        akcyz= Kd * age * v / 1000;
        return akcyz;
    }
}
