
package homework16;

public class lesson16 {//("ya@yahoo.com; on@mail.ru; ona@gmail.com;")
    public void email(String s1){
    int a = 0;
    int b = 0;
    int c = 0;
    while(c<s1.length()-1){
    a = s1.indexOf('@', c)+1;
    b = s1.indexOf('.', c);
    c = s1.indexOf(';',++c);
    System.out.println(s1.substring(a, b));
    }
    }
    public static void main(String[] args){
    lesson16 l = new lesson16();
    l.email("ya@yahoo.com; on@mail.ru; ona@gmail.com;");
    }
}
