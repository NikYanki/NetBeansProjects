package lesson18array;
public class hom1 {
    
    public static int[] sortirovka(int[]array){
        int a;
        
        for(int i=0;i<1;i++) {
            int min = array[i];
            int index=i;
                
            for(int j= i+1;j<array.length;j++){                    
                if(array[j]<min){
                    min=array[j];
                    index=j;
                    }
                System.out.println(j+"j");
            }        
            if(i != index){
            a=array[i];
            array[i]=min;
            array[index]=a;
        }
            System.out.println(i+"i");
    }
    return array;
    }
    public static void main(String[] args){
      //int[] a =new int[]{5,3,6,78,9,0};  
        
    
    int b[] = hom1.sortirovka(new int[]{14,6,12,-2,15,7,19,-20});
    for(int j=0; j<b.length;j++){
    System.out.print(b[j]+", ");
    }
    System.out.println();
    }
}
