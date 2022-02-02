package lesson25;

abstract public class figura {
    abstract void perimetr();
    abstract void ploshad();
    int kolichestvoStoron;
    void showInfo(){System.out.println("это фигура!");}
}
class kvadrat extends figura{
int storona1 = 10;
int kolichestvoStoron =4;
    void perimetr(){
        System.out.println("периметр квадрата :"+storona1*kolichestvoStoron);
    };
    void ploshad(){System.out.println("площадь квадрата :"+storona1*storona1);};
}
class pramougolnik extends figura{
    int storona1 = 10;
    int storona2 =3;
    int kolichestvoStoron =4;
    void perimetr(){
        System.out.println("периметр прямокольника :"+(storona1+storona2)*2);
    };
    void ploshad(){System.out.println("площадь прямоугольника :"+storona1*storona2);};
}
class okruznost extends figura{
    int radius =3;
    double pi =3.14;
    void perimetr(){
        System.out.println("периметр окружности :"+(pi*radius)*2);
    };
    void ploshad(){System.out.println("площадь окружности :"+pi*radius*radius);};

}
abstract class chetyrehugolnik extends figura{
    void def(){
        System.out.println("Это четырехугольник");
    }
}
class test {
    public static void main(String[] args) {
        figura f = new kvadrat();
        f.ploshad();
    }
}