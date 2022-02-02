
package lesson14;

public class homework14 {
    public static void main(String[] args){
    int chas, minuta, secunda;
    OUTER:
    for(chas = 0; chas<=6; chas+=1){
            
            
            MIDDLE:
            for(minuta = 1; minuta<=60; minuta++){
                if(chas>1 && minuta%10==0)
            break OUTER;
                
                INNER:
                for(secunda=1; secunda<=60; secunda++){
                if(secunda*chas>minuta)
                    continue MIDDLE;
                System.out.println(chas+" : "+minuta+" : "+secunda);}
            }
                    }
    }
}
