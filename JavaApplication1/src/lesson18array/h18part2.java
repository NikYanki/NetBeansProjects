
package lesson18array;

public class h18part2 {

    public static void showArray(String[][] array){

    
        System.out.print("{");
        for(int i=0; i<array.length; i++){
            System.out.print("{");
        for(int j=0; j<array[i].length; j++)
        System.out.print(array[i][j]+", ");
            System.out.print("}");
        }
        System.out.print("}");
        System.out.println();
    }
    public static void main(String[] args){
    
        String[][] array = new String[][]{ {"элемент00", "элемент01"},
            {"элемент10"}, {"элемент10", "элемент11"} };
    
        showArray(array);
    }
}
