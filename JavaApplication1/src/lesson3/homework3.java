
package lesson3;

public class homework3 {
    public static void main (String[] args){
    //first part
    int i1, i2;
    double d1, d2, result;
    long l =20L;
    i1 = 5;
    i2 = 11;
    d1 = 5.5;
    d2 = 1.3;
    result = 0;
    result= i2/d1+d2%i1-l;
    System.out.println(result);
    
    int a = 5, b = 8, a1, b2;
    a1 = a-- - --a + ++a + a++ +a;
    b2 = ++b - b++ + ++b - --b;
    System.out.println(a1+" "+b2);
    }
    
}
