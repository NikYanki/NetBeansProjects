
package lesson4;

public class BankAccount {
    String name;
    int id;
    double count;
    
    double popolnenie_scheta(double zarplata){
        count += zarplata;
        return count;
    }
    
    double snatie_so_schota(double pokupka){
        count -= pokupka;
        return count;
    }
    void user_information(){
        System.out.println("user: " + name + " balance: " + count);
    }
}
class clients{
public static void main(String[] args){
    BankAccount ba1 = new BankAccount();
    BankAccount ba2 = new BankAccount();
    BankAccount ba3 = new BankAccount();
    
    ba1.name = "Nikolay";
    ba1.id = 11;
    ba1.count = 213.67;
    ba1.popolnenie_scheta(2000);
    ba1.snatie_so_schota(43.50);
    ba1.user_information();
    
    ba2.name = "Julia";
    ba2.id = 12;
    ba2.count = 129.05;
    ba2.popolnenie_scheta(3000);
    ba2.snatie_so_schota(10.10);
    ba2.user_information();
    
    ba3.name = "Pavel";
    ba3.id = 13;
    ba3.count = 22.95;
    ba3.popolnenie_scheta(2800);
    ba3.snatie_so_schota(50.00);
    ba3.user_information();
    
  
    }
}