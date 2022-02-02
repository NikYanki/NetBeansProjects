
package lesson18array;

public class test2 {
  public static void MinMaxValue(double array[]){
  double min = array[0];
  double max = array[0];
  for(int i = 0;i<array.length;i++){
    if(min>array[i])
        min=array[i];
    if(max<array[i])
        max=array[i];
        }
        System.out.println();
        System.out.println("maximal: "+ max);
        System.out.println("minimal: "+ min);
  }
  public static void main(String[] args){
        double[] ar1 = {12,3,-5,44,33,32,23,34,56};
        test2.MinMaxValue(ar1);
}
}