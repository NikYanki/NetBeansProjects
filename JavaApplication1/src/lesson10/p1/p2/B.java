package lesson10.p1.p2;
//rabota
public class B{
    static final int JOB_TIME = 8;
    public static double wages; //zarplata
    static double days = 20;

    String process;

    public static double nachislenie(double j_p){
        wages = JOB_TIME * j_p * days;
        return wages;
    }
    public static void main(String[] args) {
        B.nachislenie(20.15);
        System.out.println(wages);
        
    }
}