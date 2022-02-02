
package lesson20;
import java.util.ArrayList;
import lesson6.employee;
import lesson4.BankAccount;
public class test {
    public static void main(String[] args){
    
        ArrayList list =new ArrayList(50);
        
        
        employee emp = new employee();
        BankAccount ba = new BankAccount();
        String s1 = new String();
        StringBuilder sb = new StringBuilder();
        
        list.add(emp);
        list.add(ba);
        list.add(s1);
        list.add(sb);
        System.out.println(list.size());
    }
    
}
