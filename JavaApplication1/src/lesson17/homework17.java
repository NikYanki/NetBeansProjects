
package lesson17;

public class homework17 {
    public boolean ravenstvo(StringBuilder sb1, StringBuilder sb2){
    //StringBuilder sb1 = new StringBuilder(s1);
    int i1 = sb1.length();
    //StringBuilder sb2 = new StringBuilder(s2);
    int i2 = sb2.length();
    String s3 = sb1.substring(0, i1);
    String s4 = sb2.substring(0, i2);
    boolean b;
    b = s3.equals(s4);
    System.out.println(b);
    return b;
    }
    public static void main(String[] args){
    homework17 h = new homework17();
    StringBuilder sb11 = new StringBuilder("hello");
    StringBuilder sb22 = new StringBuilder("Hello");
    StringBuilder sb33 = new StringBuilder("hello");
    h.ravenstvo(sb11, sb22);
    }
}
