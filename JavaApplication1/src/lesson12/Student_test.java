
package lesson12;

import lesson4.student;

public class Student_test {
    
   public static void compear_student(student st1, student st2){
   if(st1.study_year == st2.study_year)
       System.out.println("Studentu uchatsja v odnoj gruppe");
   else
       System.out.println("Studenty iz raznyh groop");
   } 
   public static void compear_student1(student st1, student st2){
   if(st1.name.equals(st2.name)){
   System.out.println("Eto odin i tot je chelovek");
   
   } else {
   System.out.println("Eto raznye studentu");
   }
   
   }
    
    
    public static void main(String[] args){
    student st1 = new student();
    
    st1.name = "Nikolay";
    st1.second_name = "Yankovyi";
    st1.study_year = 2;
    st1.number_student_ticet = 242589;
    st1.mm_math = 10;
    student st2 = new student();
    
    st2.name = "Jullia";
    st2.second_name = "Yankova";
    st2.study_year = 2;
    st2.number_student_ticet = 245989;
    st2.mm_math = 8;
    compear_student(st1, st2);
    compear_student1(st1, st2);
    }
}
