/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson12;

/**
 *
 * @author nikolajankovoj
 */
public class Student {
    String name;
    int cours;
    int grade;
    public Student(String name ,int cours, int grade){
    this.name=name;
    this.cours=cours;
    this.grade=grade;
   
    }
}

class S_test{ 
    
static void compear_name(Student s1, Student s2){
    
if(s1.name.equals(s2.name))
    System.out.println("Eto studenty s odinakovymi imenami");
else
    System.out.println("Eto sovsem raznye studenty");
}
static void compear_students(Student s1, Student s2){

    if(s1.name.equals(s2.name)){
        if(s1.cours==s2.cours){
            if(s1.grade==s2.grade){
                System.out.println("Parametry studentov sovpadaut");
            }else{
            System.out.println("Kursy i imena sovpadaut");
            }
        }else{
        System.out.println("Sovpadaut tolko imena");
        }
    }else{
    System.out.println("Eto raznye studenty");
    }
    }
public static void main(String[] args){
Student st1 =new Student("Ivan", 2, 5);
Student st2 =new Student("ivan", 2, 4);
compear_name(st1, st2);
compear_students(st1, st2);
}
}

