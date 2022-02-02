
package lesson6;

public class homework6_2 {}

class student{
    
student(int nst1, String n1, String s_n1, int s_y1){
this(nst1, n1, s_n1, s_y1, 0.0, 0.0, 0.0);
} 

student(){
this(0, null, null, 0, 0.0, 0.0, 0.0);
} 
    
student(int nst, String n, String s_n, int s_y, double mm_m, double mm_l, double mm_e){
number_student_ticet = nst;
name = n;
surname = s_n;
cours = s_y;
mm_math = mm_m;
mm_lang = mm_l;
mm_economy = mm_e;
}
int number_student_ticet;
String name;
String surname;
int cours;
double mm_math;
double mm_lang;
double mm_economy;
}
class student_test{
public static void main(String[] args){
student abiturient = new student();
student s1 = new student(4224,"Ivan","Ivanov",1);
student s2 = new student(4384, "Filip", "Filipov",2, 4.1, 4.9, 4.4);
System.out.println(abiturient.cours);
System.out.println(s1.cours);
System.out.println(s2.cours);
    }
}