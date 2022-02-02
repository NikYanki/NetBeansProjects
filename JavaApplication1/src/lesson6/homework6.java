
package lesson6;

public class homework6 {
    
}
class sum{
    int sum(){
    int result = 0;
    System.out.println("summa null: "+result);
    return result;
            }
    
    int sum(int a){
    int result1 = sum()+a;
    System.out.println("summa odnogo: "+result1);
    return result1;
            }
    
    int sum(int a1, int b1){
    int result2 =sum(a1)+b1;
    System.out.println("summa dvuh: "+result2);
    return result2;
            }
    
    int sum(int a2, int b2, int c2){
    int result3 =sum(a2,b2)+c2;
    System.out.println("summa treh: "+result3);
    return result3;
            }
    
    int sum(int a3, int b3, int c3, int d3){
    int result4 = sum(a3,b3,c3)+d3;
    System.out.println("summa chetureh: "+result4);
    return result4;
            }
    
    int sum(int a4, int b4, int c4, int d4, int e4){
    int result5 = sum(a4,b4,c4,d4)+e4;
    System.out.println("summa pjateh: "+result5);
    return result5;
            }
}
class sum_test{
public static void main(String[] args){
sum s1 = new sum();
s1.sum(11,12,13,14);
    }
}