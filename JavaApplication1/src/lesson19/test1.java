package lesson19;

public class test1 {
public static int[][] array = {{1, 3, 4, 8}, {-1, 5, 889, 9, 543, 3}, {4, 5, 6, 6, 9}, {3, 35, 64, 568, 5}};
    public static void main(String[] args) {

        
        for (int[] a : array) {
            System.out.println();
            for (int b : a) {
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
}
