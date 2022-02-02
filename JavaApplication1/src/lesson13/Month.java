
package lesson13;

public class Month {
int m;
public Month(int m){
this.m = m;
}
public static void vybery_mesyac(Month n){
switch(n.m){
    case 1:
        System.out.println("31 day");
        break;
    case 2:
        System.out.println("28 day");
        break;
    case 3:
        System.out.println("31 day");
        break;
    case 4:
        System.out.println("30 day");
        break;
    case 5:
        System.out.println("31 day");
        break;
    case 6:
        System.out.println("30 day");
        break;
    case 7:
        System.out.println("31 day");
        break;
    case 8:
        System.out.println("31 day");
        break;
    case 9:
        System.out.println("30 day");
        break;
    case 10:
        System.out.println("31 day");
        break;
    case 11:
        System.out.println("30 day");
        break;
    case 12:
        System.out.println("31 day");
        break;
        default:
                    System.out.println("nekorektnyj nomer");
}
}
public static void main(String[] args){
Month n1 = new Month(7);
vybery_mesyac(n1);
}
}
