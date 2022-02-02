
package lesson18array;
public class h18p1v2 {
    public static int[] sortirovka(int array[]){
    
        int l;
        for(int i=0;i< array.length;i++){
         int index = i;   
         int min=array[i];
         
            for(int j=i+1; j<array.length; j++){
            if(min>array[j]){
                min=array[j];
                index=j;
            }
            } 
            //if(i!=index){
            l=array[i];
            array[i]=min; 
            array[index]=l;
           // }
            
        }
        return array;
    }
    public static void main(String[] args){
        
    
        int b[] = sortirovka(new int[]{14,6,12,-2,15,7,19,-20});
    
        for(int m=0; m<b.length;m++){
    
            System.out.print(b[m]+", ");
    }
    System.out.println();
    }
}
