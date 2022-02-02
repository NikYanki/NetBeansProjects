
package lesson4;

public class student {
public int number_student_ticet;
public String name;
public String second_name;
public int study_year;
public double mm_math;
public double mm_lang;
public double mm_economy;

double result;

double srednaja_ocenka(){
    result=(mm_math + mm_lang + mm_economy)/3;
    return result;
}
void student_info(){
System.out.println(name + " " + result);
}

}
class studentTest{
    public static void main(String[] args){
    student IvanStudent = new student();
    student MariaStudent = new student();
    student OleksandrStudent =new student();
    
    double totalMidleMarkI;
    double totalMidleMarkM;
    double totalMidleMarkO;
    
    IvanStudent.number_student_ticet = 165035;
    IvanStudent.name = "Ivan";
    IvanStudent.second_name = "Ivanov";
    IvanStudent.study_year = 2004;
    IvanStudent.mm_math = 4;
    IvanStudent.mm_lang = 5;
    IvanStudent.mm_economy = 3;
    IvanStudent.srednaja_ocenka();
    IvanStudent.student_info();
    
    MariaStudent.number_student_ticet = 579045;
    MariaStudent.name = "Maria";
    MariaStudent.second_name = "Prtlura";
    MariaStudent.study_year = 2010;
    MariaStudent.mm_math = 3;
    MariaStudent.mm_lang = 5;
    MariaStudent.mm_economy = 5;
    MariaStudent.srednaja_ocenka();
    MariaStudent.student_info();
    
    OleksandrStudent.number_student_ticet = 471294;
    OleksandrStudent.name = "Olexandr";
    OleksandrStudent.second_name = "Filipov";
    OleksandrStudent.study_year = 2012;
    OleksandrStudent.mm_math = 5;
    OleksandrStudent.mm_lang = 3;
    OleksandrStudent.mm_economy = 2;
    OleksandrStudent.srednaja_ocenka();
    OleksandrStudent.student_info();
    /*totalMidleMarkI = (IvanStudent.mm_math +  IvanStudent.mm_lang + IvanStudent.mm_economy)/3;
    totalMidleMarkM = (MariaStudent.mm_math +  MariaStudent.mm_lang + MariaStudent.mm_economy)/3;
    totalMidleMarkO =(OleksandrStudent.mm_math +  OleksandrStudent.mm_lang + OleksandrStudent.mm_economy)/3;
    
    System.out.println("total midle mark Ivan: " + totalMidleMarkI);
    System.out.println("total midle mark Maria: " + totalMidleMarkM);
    System.out.println("total midle mark Olexandr: " + totalMidleMarkO);*/
    }
}
