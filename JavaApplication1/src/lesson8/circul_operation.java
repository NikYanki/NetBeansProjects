
package lesson8;

public class circul_operation {
    
public static final double pi = 3.14;

double ploschad_kruga(int r1){
    double ploschad = pi*r1*r1;
    return ploschad;
    }

static double dlinna_okruthnosti(int r2){
    double dlinna = 2*r2 ;
    return dlinna;
    }
void show_info(int r3){
System.out.println("radius kruga: " + r3);
System.out.println("dlinna_okruthnosti: " + dlinna_okruthnosti(r3));
System.out.println("ploschad_kruga " + ploschad_kruga(r3));
    }
}
class parametr_kruga{
public static void main(String[] args){
    
circul_operation krug1 = new circul_operation();
krug1.ploschad_kruga(10);

circul_operation.dlinna_okruthnosti(11);

krug1.show_info(12);
    }
}

