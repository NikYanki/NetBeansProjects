
package lesson17;
public class h17 {
    public boolean ravenstvo(StringBuilder sb1, StringBuilder sb2){
    boolean b = true;
    if(sb1.length()==sb2.length()){
    for(int i = 0; i<sb1.length();i++){
    if(sb1.charAt(i)!=sb2.charAt(i)){
    b=false;
    break;
    }
    }
    }
    System.out.println(b);
    return b;
    } 
     public static void main(String[] args){
    h17 h = new h17();
    StringBuilder sb11 = new StringBuilder("hello");
    StringBuilder sb22 = new StringBuilder("Hello");
    StringBuilder sb33 = new StringBuilder("hello");
    h.ravenstvo(sb11, sb33);
    }
}
