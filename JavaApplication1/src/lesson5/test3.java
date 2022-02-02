
package lesson5;

public class test3 {
    int summa(int a, int b, int c){
    int result = a + b + c; 
    return result;
    }
    
    int sredee_arifmetic( int a1, int b1, int c1){
    int result2 =summa(a1,b1,c1)/3;
    return result2;
    }
}
class test4{
public static void main(String[] args){
test3 t = new test3();
int summaTrexChisel = t.summa(12, 22, 72);
System.out.println(summaTrexChisel);
System.out.println(t.sredee_arifmetic(20, 40, 60));
    }
}