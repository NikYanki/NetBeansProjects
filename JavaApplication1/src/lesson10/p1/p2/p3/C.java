package lesson10.p1.p2.p3;
//house
public class C{
    int house_squere = 60;
    int rooms = 3;
    public void show_info(){
        System.out.println("v dome "+ rooms + " komnaty ploscadyu: " + house_squere);
    }
    public static void main(String[] args) {
        C  dom = new C();
        dom.show_info();
    }
}
