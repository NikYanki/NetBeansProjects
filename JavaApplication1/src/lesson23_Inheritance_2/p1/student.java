
package lesson23_Inheritance_2.p1;

import lesson23_Inheritance_2.human;

class student extends human{
    public static void main(String[] args){
    student st = new student();
    System.out.println(student.salary);
    System.out.println(st.name);
    st.work();
    student.rest();
    }

}