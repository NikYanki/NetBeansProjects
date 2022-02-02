
package homework16;

public class Email {
    String s1 = new String("ya@yahoo.com; on@mail.ru; ona@gmail.com;");
    
    void email(String s1){
        this.s1=s1;
        char c1;
        for(int i=0; i<s1.length();i+=1){
            c1=s1.charAt(i);
            if(c1==' '){
                System.out.println();
                continue;
                }
            System.out.print(c1);        
            }
    }
}
    class test{
    public static void main(String[] args){
  Email e = new Email();
        String s1=e.s1;
  e.email(s1);
    System.out.println();
}
    
}
