package lesson19;
public class test {
    
    public static void main(String[] args){
        
        String[] Students = {"Ivan", "Volodya", "Alesha"};
        String[] Exams = {"mathAn","filosofy","economy"};
        for(String a: Students){
            System.out.println();
            for(String b: Exams){
                System.out.println(a+" "+b+":  ");
            }
        }
        
    
}    
}
